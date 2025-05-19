class Animal {
    String nama;
    String jenis;
    String suara;

    public Animal(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    //untuk output
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        //objek hewannya  
        Animal hewan1 = new Animal("Kucing", "Mamalia", "Meoww~");
        Animal hewan2 = new Animal("Anjing", "Mamalia", "Guk-guk!!");

        // Memanggil method displayInfo untuk kedua objek
        hewan1.displayInfo();
        hewan2.displayInfo();
    }
}
