package ru.alemasov.task3;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class resController {

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField nField;

    @FXML
    private Button okButton;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
            int n = Integer.parseInt(nField.getText());
            if (n <= 0) {
                answerLabel.setText("N должно быть больше нуля");
                return;
            }
            double sum = 1.1;
            for (int i = 1; i <= n; i++) {
                sum += pow(-1, i - 1) * 0.1 - i;
            }
            answerLabel.setText(String.format("%.2f",sum));

    }
}

