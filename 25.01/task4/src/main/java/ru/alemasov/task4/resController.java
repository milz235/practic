package ru.alemasov.task4;

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
    private TextField nField;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aField.getText());
        int n = Integer.parseInt(nField.getText());
        if (n <= 0) {
            answerLabel.setText("N должно быть больше нуля");
            return;
        }
        String res = "";
        for (int i = 1;i<=n;i++){
            res+=""+pow(a,i);
        }
        answerLabel.setText(""+res);

    }
}
