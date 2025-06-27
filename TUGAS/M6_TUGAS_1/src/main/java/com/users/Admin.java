package main.java.com.users;

import main.java.com.actions.AdminActions;

public class Admin extends User implements AdminActions { //inherit dari user dan AdminActions
    public Admin(String username, String password) {
        super(username, password); //untuk memanggil kosntruktor
    }

    @Override
    public void lihatLaporanBarang(){ //untuk menampilkan laporan barang
    } ;

    @Override
    public void tandaiBarangClaimed(String namaBarang) {
    };

    @Override
    public void lihatDataMahasiswa() {
    };
}