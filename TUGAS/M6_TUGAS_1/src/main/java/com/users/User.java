package main.java.com.users;

public abstract class User { //abstract untuk menyimpan usn dan pass
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username; //untuk menyimpan nilai usn dan pass ke dalam variable class
        this.password = password;
    }

    public String getUsername() {
        return username;
    } //untuk mengambil usn

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
} //cek apakah password cocok