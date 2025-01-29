package ru.alemasov.ex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.alemasov.ex.util.Manager.showSecondStage;

public class newController {

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml","Marathon Skilla 2016 - Register as a runner");
    }

}
