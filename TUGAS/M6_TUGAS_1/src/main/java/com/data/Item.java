package main.java.com.data;

public class Item {
    private String nama;
    private String lokasi;
    private String status;

    public Item(String nama, String lokasi) {
        this.nama = nama; //constructor
        this.lokasi = lokasi;
        this.status = "Reported";
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}