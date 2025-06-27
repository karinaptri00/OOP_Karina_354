import java.util.Scanner;

public class testsatu{
    public static void main(String[] args){
        String namadepan;
        int umur;
        Scanner objnput = new Scanner(System.in);//system.in untuk ambil input dari user

        System.out.print("siapa nama kamu? ");
        namadepan = objnput.nextLine(); //untuk menginput sebuah nilai kedalam variabel namadepan
        System.out.print("berapa usia kamu? ");
        umur = objnput.nextInt();

        System.out.println("nama saya" +namadepan);
        System.out.println("umur saya " +umur);
    }
}
