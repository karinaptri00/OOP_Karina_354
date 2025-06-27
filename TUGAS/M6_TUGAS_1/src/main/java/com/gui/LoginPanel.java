package main.java.com.gui;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import main.java.com.main.LoginSystem;

public class LoginPanel extends VBox {
    public LoginPanel(LoginSystem loginSystem) {
        setPadding(new Insets(20));
        setSpacing(10);

        Text title = new Text("Login");
        ComboBox<String> roleBox = new ComboBox<>(); //untuk pilihan login mhs atau adm
        roleBox.getItems().addAll("Mahasiswa", "Admin");
        roleBox.setValue("Mahasiswa");


        TextField usernameField = new TextField(); //untuk mengetik username dan pass
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Login");
        Label resultLabel = new Label();

        Button ClickButton = new Button("click");
        Label resulylabel = new Label();

        loginButton.setOnAction(e -> {
            boolean success = loginSystem.handleLogin(
                    roleBox.getValue(),
                    usernameField.getText(),
                    passwordField.getText()
            );
            if (!success) {
                resultLabel.setText("Login gagal. Coba lagi.");
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Login");
                alert.setHeaderText(null);
                alert.setContentText("Login berhasil!");
                alert.showAndWait();
            }
        });


        loginButton.setOnAction(e -> { //untuk sistem memulai login
            boolean success = loginSystem.handleLogin(
                    roleBox.getValue(),
                    usernameField.getText(),
                    passwordField.getText()
            );
            if (!success) {
                resultLabel.setText("Login gagal. Coba lagi.");
            }
        });

        getChildren().addAll(title, roleBox, usernameField, passwordField, loginButton, resultLabel);
    }
}
