package main.java.com.main;

import javafx.stage.Stage;
import main.java.com.data.DataStore;
import main.java.com.gui.AdminDashboard;
import main.java.com.gui.MahasiswaDashboard;
import main.java.com.users.Admin;
import main.java.com.users.Mahasiswa;

public class LoginSystem {
    private Stage primaryStage; //tempat semua tampilan muncul
    private DataStore dataStore; //tempat menyimpanan data barang

    public LoginSystem(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.dataStore = new DataStore();
    }

    public boolean handleLogin(String role, String username, String password) { //untuk memeriksa peran dan data login
        if (role.equals("Mahasiswa")) {
            Mahasiswa mahasiswa = new Mahasiswa(username, password); //objek mahasiswa dgn username dan password
            new MahasiswaDashboard(primaryStage, mahasiswa, dataStore).show();
            return true;
        } else if (role.equals("Admin")) { //login admin
            if (username.equals("admin") && password.equals("admin")) { //cek apakah username dan password sama
                Admin admin = new Admin(username, password);
                new AdminDashboard(primaryStage, admin, dataStore).show();
                return true;
            }
        }
        return false;
    }
}
