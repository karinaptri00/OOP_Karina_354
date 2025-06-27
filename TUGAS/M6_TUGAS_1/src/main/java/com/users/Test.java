package main.java.com.users;

public class Test {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("karin", "354");
        Admin adm = new Admin("admin", "admin");

        System.out.println("Mahasiswa: " + mhs.getUsername());
        System.out.println("Admin: " + adm.getUsername());
    }
}
