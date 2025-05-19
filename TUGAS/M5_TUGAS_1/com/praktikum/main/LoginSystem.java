package com.praktikum.main;

import com.praktikum.users.User;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Inisialisasi data
        DataStorage.initializeData();
        
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Sistem Login ===");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("0")) {
                System.out.println("Terima kasih!");
                break;
            }

            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            User loggedInUser = null;
            for (User user : DataStorage.userList) {
                if (user.login(username, password)) {
                    loggedInUser = user;
                    break;
                }
            }

            if (loggedInUser != null) {
                System.out.println("\nLogin berhasil sebagai " + loggedInUser.getClass().getSimpleName());
                loggedInUser.displayAppMenu();
            } else {
                System.out.println("\nLogin gagal. Username atau password salah.");
            }
        }
        scanner.close();
    }
}