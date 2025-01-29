package ru.alemasov.program.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

import static ru.alemasov.program.util.Manager.showSecondStage;

public class RegController {

    @FXML
    private TextField NameField;

    @FXML
    private TextField PPassField;

    @FXML
    private DatePicker ddField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField familField;

    @FXML
    private Label infLabel;

    @FXML
    private TextField pasField;

    @FXML
    private TextField polField;

    @FXML
    private TextField stranaField;

    @FXML
    void backField(ActionEvent event) {
        showSecondStage("menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }
    static String email, p, pp;
    @FXML
    void regField(ActionEvent event) {
        email = emailField.getText();
        p = pasField.getText();
        pp = PPassField.getText();
        if (p.equals(pp)){
            showSecondStage("sum-view.fxml", "Marathon Skills 2016 - Register for an event");
        }else{
            PPassField.setText("Пароли не сопадают!");
        }
    }
    @FXML
    void initialize() {
        assert emailField!=null:"fx:id=\"emailField\" was not injected: check your FXML file 'reg-view.fxml'.";
        assert pasField!=null:"fx:id=\"pasField\" was not injected: check your FXML file 'reg-view.fxml'.";
        assert PPassField!=null: "fx:id=\"PPassField\" was not injected: check your FXML file 'reg-view.fxml'.";
    }

}
