package main.java.com.users;

import main.java.com.actions.MahasiswaActions;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String username, String password) {
        super(username, password);
    }


    @Override
    public void laporBarangHilang(String namaBarang, String deskripsi, String lokasi) {
    };

    @Override
    public void lihatLaporanSaya() {
    };
}