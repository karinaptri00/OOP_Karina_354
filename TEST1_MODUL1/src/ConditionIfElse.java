import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);
        int angka;
        System.out.println("masukkan angka dari 1 - 10 = ");
        angka = objinput.nextInt();

        if (angka % 2 == 0) { //masukkan modulus : angka yang habis dibagi 2 maka genap. selebihnya ganjil.
            System.out.println("angka genap");
        } else {
            System.out.println("Angka ganjil");
        }
    }
}
