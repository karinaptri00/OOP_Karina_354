class KarakterGame { //Superclass 
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    //Getter setter nama 
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    //Getter setter kesehatan 
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
    public int getKesehatan() {
        return kesehatan;
    }

    public void tampilkanStatus() {
        System.out.println(nama + " memiliki kesehatan: " + kesehatan);
    }

    public void serang(KarakterGame target) {
        System.out.println("SERANGAN KUAT!");
    }
}

//Subclass Pahlawan
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " Menggunakan pedang! ");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

//Subclass Musuh
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " Menggunakan sihir! ");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

public class main3 {
    public static void main(String[] args) {
        KarakterGame umum = new KarakterGame("Karakter Umum", 100);
        Pahlawan p1 = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        System.out.println("== Status awal ==");
        p1.tampilkanStatus();
        musuh.tampilkanStatus();
        System.out.println();
        p1.serang(musuh);
        System.out.println();
        musuh.serang(p1);
    }
}
