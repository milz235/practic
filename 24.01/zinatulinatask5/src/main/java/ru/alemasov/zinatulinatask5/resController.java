package ru.alemasov.zinatulinatask5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField mesField;

    @FXML
    private TextField procField;

    @FXML
    private TextField sumField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        double P = Double.parseDouble(procField.getText());
        double sum = 1000;
        int month = 0;
        while (sum <= 1100) {
            sum += (P / 100) * sum;
            month++;
        }
        mesField.setText("" + month);
        sumField.setText("" + sum);

    }

}
