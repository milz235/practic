package ru.alemasov.ex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public interface goControlle {
    @FXML
    void goButtonOnAction(ActionEvent event);

    void initialize(URL url, ResourceBundle resourceBundle);
}
