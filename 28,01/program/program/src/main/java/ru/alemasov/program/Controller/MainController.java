package ru.alemasov.program.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.alemasov.program.util.Manager.showSecondStage;

public class MainController {

    @FXML
    private Button begButton;

    @FXML
    private Button loginButton;

    @FXML
    void begButtonOnAction(ActionEvent event) {
showSecondStage("menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
showSecondStage("login-view.fxml","Marathon Skills 2016 - Login");

    }

}
