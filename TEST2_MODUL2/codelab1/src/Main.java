
public class Main {
    public static void main(String[] args){
        //object (hewan 1 dan hewan 2)
        Animal Hewan1 = new Animal ();
        Animal Hewan2 = new Animal ();

        //isi objectnya
        Hewan1.Nama ="Kuciang";
        Hewan1.Tipe = "Mammal";
        Hewan1.Suara = "meoww";

        Hewan2.Nama = "Doggiee";
        Hewan2.Tipe = "Mammal";
        Hewan2.Suara = "Woof woof";

        //disinilah method dipanggil
        Hewan1.displayInfo();
        Hewan2.displayInfo();
    }
}
