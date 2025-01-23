package ru.alemasov.zinatullina_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Math.abs;

public class resController {

    @FXML
    private Button resButton;

    @FXML
    private TextField resField;

    @FXML
    private TextField xField;

    @FXML
    private TextField yField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int x = Integer.parseInt(xField.getText());
        int y = Integer.parseInt(yField.getText());
        if (y >= 0 && y <= 12) {
            if (y > abs(x)) {
                resField.setText("Да");
            } else if (y < abs(x)) {
                resField.setText("Нет");
            } else {
                resField.setText("На границе");
            }
        }else {resField.setText("Нет");}

    }

}
