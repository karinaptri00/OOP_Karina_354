package main.java.com.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.main.*;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        LoginSystem loginSystem = new LoginSystem(primaryStage); //tampilan login yang bisa dipakai user
        LoginPanel loginPanel = new LoginPanel(loginSystem);

        Scene scene = new Scene(loginPanel, 300, 250); //ukuran
        primaryStage.setTitle("Sistem Lost & Found"); //judul
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
} //run
