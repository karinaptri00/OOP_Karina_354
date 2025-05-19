public class Barang {
    private String nama; //encapsulation
    private int stok;

    public Barang(String nama, int stok) { //constructor
        this.nama = nama;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) { //untuk mengubah jumlah stock
        this.stok = stok;
    }
}
