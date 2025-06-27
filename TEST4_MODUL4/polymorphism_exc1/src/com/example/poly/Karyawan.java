package com.example.poly;

public class Karyawan {
    protected  String nama;

    public Karyawan(String inputkrywn){
        this.nama = inputkrywn;
    }

    public void kerja(){
        System.out.println(nama + "sedang bekerja");
    }
}
