package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import com.praktikum.main.DataStorage;
import com.praktikum.models.Item;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        return this.getUsername().equals(username) && this.getPassword().equals(password);
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Hilang/Temuan");
            System.out.println("2. Lihat Semua Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout berhasil...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Lapor Barang ===");
        System.out.print("Nama Barang: ");
        String itemName = scanner.nextLine();
        System.out.print("Deskripsi: ");
        String description = scanner.nextLine();
        System.out.print("Lokasi: ");
        String location = scanner.nextLine();

        // Create item with 3 parameters
        Item item = new Item(itemName, description, location);

        // Set status separately if needed
        System.out.print("Status (Hilang/Temuan): ");
        String status = scanner.nextLine();
        item.setStatus(status);

        DataStorage.reportedItems.add(item);
        System.out.println("\n>> Barang berhasil dilaporkan <<");
    }

    @Override
    public void viewReportedItems() {
        System.out.println("\n=== Daftar Laporan Barang ===");
        if (DataStorage.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
        } else {
            for (int i = 0; i < DataStorage.reportedItems.size(); i++) {
                System.out.println((i + 1) + ". " + DataStorage.reportedItems.get(i));
            }
        }
    }
}