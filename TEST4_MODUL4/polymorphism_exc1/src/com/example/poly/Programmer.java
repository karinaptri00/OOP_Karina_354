package com.example.poly;

public class Programmer extends Karyawan {
    public Programmer(String nama){
        super(nama);
    }

    @Override
    public void kerja(){
        System.out.println(nama + "Sedang menulis kode");
    }

}
