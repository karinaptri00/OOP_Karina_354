package main.java.com.gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.java.com.data.*;
import main.java.com.users.*;

public class MahasiswaDashboard {
    private Stage stage;
    private Mahasiswa mahasiswa;
    private DataStore dataStore;

    public MahasiswaDashboard(Stage stage, Mahasiswa mahasiswa, DataStore dataStore) {
        this.stage = stage;
        this.mahasiswa = mahasiswa;
        this.dataStore = dataStore;
    }

    public void show() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Label welcome = new Label("Selamat datang, " + mahasiswa.getUsername());
        TextField namaField = new TextField();
        namaField.setPromptText("Nama Barang");

        TextField lokasiField = new TextField();
        lokasiField.setPromptText("Lokasi Kehilangan");

        Button laporButton = new Button("Lapor Barang");
        ListView<String> laporanList = new ListView<>();
        //tombol untuk melapor dan daftar laporan miliknya sendiri

        laporButton.setOnAction(e -> {
            Item item = new Item(namaField.getText(), lokasiField.getText());
            dataStore.addItem(item);
            laporanList.getItems().add(item.getNama() + " - " + item.getLokasi());
            namaField.clear();
            lokasiField.clear();
        });  //untuk menyimpan ke DataStore dan ditampilkan di daftar laporan pribadi

        root.getChildren().addAll(welcome, namaField, lokasiField, laporButton, new Label("Laporan Saya:"), laporanList);

        stage.setScene(new Scene(root, 400, 400));
        stage.setTitle("Dashboard Mahasiswa");
    }
}