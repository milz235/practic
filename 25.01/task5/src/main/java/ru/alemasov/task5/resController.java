package ru.alemasov.task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class resController {

    @FXML
    private TextField aField;

    @FXML
    private Label answerLabel;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        int i = Integer.parseInt(aField.getText());
        double res = 1;
        double a0 = 1;
        double a1 = 1;
        for (i = 2; i < 15; i++) ;
        {
            double a = a0 + (a1 / pow(2, i - 1));
            res *= a;
            a0 = a1;
            a1 = a;

        }
        answerLabel.setText("" + res);

    }
}
