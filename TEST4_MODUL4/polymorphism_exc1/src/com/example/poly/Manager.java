package com.example.poly;

public class Manager extends Karyawan{
    public Manager(String nama){
        super(nama);
    }

    @Override
    public void kerja(){
        System.out.println(nama + "Sedang Rapat");
    }
}
