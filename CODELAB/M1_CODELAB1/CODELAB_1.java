import java.util.Scanner;
import java.time.LocalDate;

public class CODELAB_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //membuat scanner agar bisa membaca input user

        //untuk mengambil input dari user
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelaminInput = scanner.next().charAt(0);
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        scanner.close(); //untuk menutup scanner agar tidak boros memori

        //perhitungan umur user
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        //penentuan jenis kelamin user
        String jenisKelamin;
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput == 'P' || jenisKelaminInput == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak diketahui";
        }

        //output
        System.out.println("\nData Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur + " tahun");
    }
}