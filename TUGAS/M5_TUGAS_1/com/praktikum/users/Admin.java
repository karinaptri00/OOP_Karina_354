package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.main.DataStorage;
import com.praktikum.models.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    public Admin(String username, String password) {
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
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Lihat Semua Laporan");
            System.out.println("2. Hapus Laporan Barang");
            System.out.println("3. Kelola Pengguna");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    deleteReportedItem();
                    break;
                case 3:
                    manageUsers();
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
    public void manageItems() {
        System.out.println("\n=== Daftar Barang Terlapor ===");
        if (DataStorage.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan.");
        } else {
            for (int i = 0; i < DataStorage.reportedItems.size(); i++) {
                System.out.println((i + 1) + ". " + DataStorage.reportedItems.get(i));
            }
        }
    }

    public void deleteReportedItem() {
        Scanner scanner = new Scanner(System.in);
        if (DataStorage.reportedItems.isEmpty()) {
            System.out.println("Tidak ada laporan untuk dihapus.");
            return;
        }

        manageItems();
        System.out.print("\nMasukkan nomor laporan yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > DataStorage.reportedItems.size()) {
            System.out.println("Nomor tidak valid.");
        } else {
            Item removed = DataStorage.reportedItems.remove(index - 1);
            System.out.println("Laporan '" + removed.getItemName() + "' berhasil dihapus.");
        }
    }

    @Override
    public void manageUsers() {
        System.out.println("\n=== Daftar Pengguna ===");
        if (DataStorage.userList.isEmpty()) {
            System.out.println("Belum ada pengguna terdaftar.");
        } else {
            for (int i = 0; i < DataStorage.userList.size(); i++) {
                User user = DataStorage.userList.get(i);
                System.out.println((i + 1) + ". " + user.getClass().getSimpleName() + " - " + user.getUsername());
            }
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nMasukkan nomor pengguna yang ingin dihapus (0 untuk batal): ");
            int index = scanner.nextInt();
            scanner.nextLine();

            if (index == 0) return;
            
            if (index < 1 || index > DataStorage.userList.size()) {
                System.out.println("Nomor tidak valid.");
            } else {
                User removed = DataStorage.userList.remove(index - 1);
                System.out.println("Pengguna '" + removed.getUsername() + "' berhasil dihapus.");
            }
        }
    }
}