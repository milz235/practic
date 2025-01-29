package ru.alemasov.program.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.net.URL;

import java.util.Objects;

import static ru.alemasov.program.Controller.RegController.email;
import static ru.alemasov.program.Controller.RegController.p;
import static ru.alemasov.program.util.Manager.showSecondStage;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private TextField passField;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        String mail = emailField.getText();
        String pass = passField.getText();
        if (RegController.email.equals(mail) && pass.equals(p)) {
            showSecondStage("hello-view.fxml", "Marathon Skills2016-Register for an event");
        } else {
            passField.setText("данные неверны");
        }
    }
    @FXML
    void initialize() {
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'login-view.fxml'.";
        assert p != null : "fx:id=\"p\" was not injected: check your FXML file 'login-view.fxml'.";
}
}




