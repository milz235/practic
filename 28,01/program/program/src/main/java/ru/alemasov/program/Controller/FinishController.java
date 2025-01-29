package ru.alemasov.program.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.alemasov.program.util.Manager.showSecondStage;

public class FinishController {


    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondStage("sum-view.fxml", "Marathon Skills 2016 - Register for an event");

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");

    }

}
