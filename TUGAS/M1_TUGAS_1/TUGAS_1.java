import java.util.Scanner;

public class TUGAS_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input user
        System.out.println("== PILIH JENIS LOGIN ==");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2) : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        //UNTUK LOGIN ADMIN
        if (pilihan == 1) {
            System.out.print("Masukkan username anda : ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password anda : ");
            String password = scanner.nextLine();

            String NIMAKHIR = "354"; // 3-digit terakhir NIM
            String VALIDUSERNAME = "admin" + NIMAKHIR;
            String VALIDPASSWORD = "0p0p" + NIMAKHIR;

            if (username.equals(VALIDUSERNAME) && password.equals(VALIDPASSWORD)) {
                System.out.println("LOGIN SEBAGAI ADMIN BERHASIL.");
            } else {
                System.out.println("LOGIN GAGAL! username atau password salah");
            }

            //UNTUK LOGIN MAHASIGMA
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama anda : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM anda : ");
            String nim = scanner.nextLine();

            String VALIDNAME = "Karina Putri Ani";
            String VALIDNIM = "202410370110354";

            if (nama.equals(VALIDNAME) && nim.equals(VALIDNIM)){
                System.out.println("Login mahasiswa berhasil!");
                System.out.println("Nama : " + nama);
                System.out.println("NIM : " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
