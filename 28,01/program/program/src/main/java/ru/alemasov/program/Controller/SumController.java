package ru.alemasov.program.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import static ru.alemasov.program.util.Manager.showSecondStage;

public class SumController {

    @FXML
    private CheckBox avar;

    @FXML
    private CheckBox bvar;

    @FXML
    private CheckBox cvar;

    @FXML
    private CheckBox onekm;

    @FXML
    private Label sumlabel;

    @FXML
    private CheckBox teokm;

    @FXML
    private CheckBox threekm;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondStage("reg-view.fxml","Marathon Skills 2016 - Register as a run");
    }

    @FXML
    void regButtonOnAction(ActionEvent event) {
        showSecondStage("finish-view.fxml","Marathon Skills 2016 - Registration confirmation");


    }

}
