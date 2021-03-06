package com.example.projekt_z_javy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class Register {

    @FXML
    private Button submitButton;
    @FXML
    private TextField email;
    @FXML
    private TextField name;
    @FXML
    private PasswordField password;

    public void getData(ActionEvent actionEvent) throws SQLException, IOException {
        Main m = new Main();
        System.out.println(name.getText());
        System.out.println(email.getText());
        System.out.println(password.getText());
        JavaPostgreSQL.writeToDatabase(name.getText(),email.getText(),password.getText());
        m.changeScene("login-view.fxml");
    }

    public void backToMain(ActionEvent actionEvent) throws SQLException, IOException {
        Main m = new Main();
        m.changeScene("login-view.fxml");
    }
}