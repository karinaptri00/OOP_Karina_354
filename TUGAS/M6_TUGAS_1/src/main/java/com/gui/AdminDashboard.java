package main.java.com.gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.java.com.data.*;
import main.java.com.users.*;

public class AdminDashboard {
    private Stage stage;
    private Admin admin;
    private DataStore dataStore;

    public AdminDashboard(Stage stage, Admin admin, DataStore dataStore) {
        this.stage = stage;
        this.admin = admin;
        this.dataStore = dataStore;
    }

    public void show() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Label welcome = new Label("Selamat datang Admin, " + admin.getUsername());
        ListView<String> itemList = new ListView<>(); //utk daftar semua barang yang ditemukan

        for (Item item : dataStore.getDaftarItem()) {
            itemList.getItems().add(item.getNama() + " - " + item.getLokasi() + " - " + item.getStatus());
        } //untuk mengisi daftar nama lokasi dan status barang

        TextField itemNameField = new TextField();
        itemNameField.setPromptText("Nama barang untuk ditandai Claimed");

        Button markClaimedBtn = new Button("Tandai Claimed");
        markClaimedBtn.setOnAction(e -> {
            dataStore.tandaiClaimed(itemNameField.getText());
            itemList.getItems().clear();
            for (Item item : dataStore.getDaftarItem()) {
                itemList.getItems().add(item.getNama() + " - " + item.getLokasi() + " - " + item.getStatus());
            }
        });

        root.getChildren().addAll(welcome, new Label("Daftar Barang Ditemukan:"), itemList, itemNameField, markClaimedBtn);

        stage.setScene(new Scene(root, 450, 400));
        stage.setTitle("Dashboard Admin");
    }
}