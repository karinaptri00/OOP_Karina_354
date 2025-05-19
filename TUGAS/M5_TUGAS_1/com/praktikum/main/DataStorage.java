package com.praktikum.main;

import com.praktikum.users.User;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.models.Item;
import java.util.ArrayList;

public class DataStorage {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void initializeData() {
        // Tambah user default
        userList.add(new Admin("admin", "admin123"));
        userList.add(new Mahasiswa("mahasiswa1", "mhs123"));
        userList.add(new Mahasiswa("karin", "karin354"));
    }
}