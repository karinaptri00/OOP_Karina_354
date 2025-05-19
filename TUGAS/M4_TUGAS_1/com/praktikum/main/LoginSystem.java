package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("=== Sistem Login ===");
            System.out.println("Pilih Peran:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("0")) {
                System.out.println("Terima kasih! Program selesai.");
                running = false;
                continue;
            }

            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            User user = null;

            switch (pilihan) {
                case "1":
                    user = new Admin("admin", "admin354");
                    break; //termasuk polymorphism (nama class sama, parameter berbeda)
                case "2":
                    user = new Mahasiswa("karin", "karin354");
                    break;
                default:
                    System.out.println("Peran tidak dikenali.");
                    continue; // Kembali ke atas loop
            }

            if (user.login(username, password)) {
                System.out.println("Login berhasil!");
                user.displayAppMenu();
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }

            // Setelah menu selesai, kembali ke awal loop
            System.out.println();
        }

        scanner.close();
    }
}
