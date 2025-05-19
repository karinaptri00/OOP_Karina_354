class BankAccount {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public BankAccount(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    //output informasi akun bank
    public void displayInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println();
    }

    //untuk menyetor uang ke akun
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor Rp " + jumlah + ". Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
        System.out.println();
    }

    //untuk menarik uang dari akun
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp " + jumlah + ". (Berhasil) Saldo sekarang: Rp " + saldo);
        } else if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp " + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp " + saldo);
        } else {
            System.out.println("Jumlah tarik harus lebih dari 0!");
        }
        System.out.println();
    }
}

public class main {
    public static void main(String[] args) {
        //untuk dua objek BankAccount yang dipanggil
        BankAccount akun1 = new BankAccount("202410370110254", "Karina Putri Ani", 5000000.0);
        BankAccount akun2 = new BankAccount("202410370110191", "Ani Seila Nanda Putri", 3000000.0);

        //untuk informasi rekening sebelum transaksi
        akun1.displayInfo();
        akun2.displayInfo();

        //untuk transaksi setor uang
        akun1.setorUang(200000.0);
        akun2.setorUang(500000.0);

        //untuk transaksi tarik uang
        akun1.tarikUang(800000.0); // Gagal karena saldo tidak cukup
        akun2.tarikUang(300000.0); // Berhasil

        //untuk menampilkan informasi rekening setelah transaksi
        akun1.displayInfo();
        akun2.displayInfo();
    }
}
