package ru.alemasov.program.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.alemasov.program.util.Manager.showSecondStage;

public class MenuController {

    @FXML
    void nazadButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void newplayerButtonOnAction(ActionEvent event) {
        showSecondStage("reg-view.fxml","Marathon Skills 2016 - Register as a run");

    }

    @FXML
    void playerNuttonOnAction(ActionEvent event) {
        showSecondStage("login-view.fxml","Marathon Skills 2016 - Login");

    }

}
