package com.example.modul6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;

import java.util.Random;

public class HelloApplication extends Application {
    private int angkaTebakan;
    private int jumlahPercobaan;
    private Label feedbackLabel;
    private Label percobaanLabel;
    private TextField inputField;
    private Random random;

    @Override
    public void start(Stage primaryStage) {
        random = new Random();
        angkaTebakan = random.nextInt(100) + 1;
        jumlahPercobaan = 0;

        Label titleLabel = new Label("Tebak Angka 1-100");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        inputField = new TextField();
        inputField.setPromptText("Masukkan angka 1-100");
        inputField.setMaxWidth(200);
        inputField.setAlignment(Pos.CENTER);

        Button tebakButton = new Button("Tebak!");
        tebakButton.setOnAction(e -> prosesTebakan());

        feedbackLabel = new Label("Masukkan angka antara 1-100");
        percobaanLabel = new Label("Jumlah percobaan: 0");

        VBox root = new VBox(15, titleLabel, inputField, tebakButton, feedbackLabel, percobaanLabel);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Tebak Angka - JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void prosesTebakan() {
        try {
            int tebakan = Integer.parseInt(inputField.getText());
            jumlahPercobaan++;
            percobaanLabel.setText("Jumlah percobaan: " + jumlahPercobaan);

            if (tebakan < 1 || tebakan > 100) {
                feedbackLabel.setText("Masukkan angka antara 1-100!");
            } else if (tebakan < angkaTebakan) {
                feedbackLabel.setText("Terlalu kecil!");
            } else if (tebakan > angkaTebakan) {
                feedbackLabel.setText("Terlalu besar!");
            } else {
                feedbackLabel.setText("Tebakan benar! Angka baru telah dibuat.");
                angkaTebakan = random.nextInt(100) + 1;
                jumlahPercobaan = 0;
            }
        } catch (NumberFormatException e) {
            feedbackLabel.setText("Masukkan angka yang valid!");
        }
        inputField.clear();
    }

    public static void main(String[] args) {
        launch();
    }
}