package com.example.projekt_z_javy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.sql.SQLException;

public class Lobby {

    @FXML
    private Button wylogujButton;

    @FXML
    private Button dodajButton;

    public void userLogout(ActionEvent actionEvent) throws SQLException {
        System.out.println("Wylogowuje...");
        //checkLogin();
    }

    public void goToAddReservation(ActionEvent actionEvent) throws SQLException {
        System.out.println("Dodaje rezerwacje...");

    }
}



