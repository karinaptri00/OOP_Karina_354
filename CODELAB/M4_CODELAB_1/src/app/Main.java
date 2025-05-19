import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Fiksi("Bumi", "Tere Liye");
        Buku buku2 = new NonFiksi("Sapiens", "Yuval Noah Harari");

        buku1.displayInfo();
        System.out.println();
        buku2.displayInfo();
        System.out.println();

        // Membuat objek Anggota
        Anggota anggota1 = new Anggota("Nindi", "300");
        Anggota anggota2 = new Anggota("Ani", "191");

        anggota1.pinjamBuku("Laskar Pelangi");
        anggota2.pinjamBuku("Sapiens", 7);

        System.out.println();

        anggota1.kembalikanBuku("Laskar Pelangi");
        anggota2.kembalikanBuku("Sapiens");
    }
}
