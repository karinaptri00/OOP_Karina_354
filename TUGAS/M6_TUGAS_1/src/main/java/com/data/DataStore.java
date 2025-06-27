package main.java.com.data;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static List<Item> daftarItem = new ArrayList<>(); //daftar kosong untuk menyimpan semua barang

    public static void addItem(Item item) {
        daftarItem.add(item);
    } // untuk menambah barang ke daftar

    public static List<Item> getDaftarItem() {
        return daftarItem;
    } //untuk melihat daftar itemnya

    public static Item cariItem(String nama) { //untuk mencari daftar berdasarkan nama
        for (Item item : daftarItem) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }

    public static void tandaiClaimed(String namaItem) { //untuk mrngubah status barang jika sudahd di claimed
        Item item = cariItem(namaItem);
        if (item != null) {
            item.setStatus("Claimed");
        }
    }
}