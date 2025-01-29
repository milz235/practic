package ru.alemasov.ex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.alemasov.ex.util.Manager.showSecondStage;

public class goController implements goControlle {

    @FXML
    private Button goButton;

    @FXML
    @Override
    public void goButtonOnAction(ActionEvent event) {
        showSecondStage("new-view.fxml", "Marathon Skills 2016");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        goButton.setStyle("-fx-background-color:#20B2AA;-fx-background-radius:5px;-fx-text-fill:#ffffff");

    }



}
