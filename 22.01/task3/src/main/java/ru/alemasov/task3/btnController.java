package ru.alemasov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class btnController {

    @FXML
    private Button btn;

    @FXML
    private TextField godField;

    @FXML
    private TextField nedField;

    @FXML
    void btnOnAction(ActionEvent event) {
        int K = Integer.parseInt(godField.getText());
        int D = K % 7 + 1;
        switch (D) {
            case 1:
                nedField.setText("Понедельник");
                break;
            case 2:
                nedField.setText("Вторник");
                break;
            case 3:
                nedField.setText("Среда");
                break;
            case 4:
                nedField.setText("Четверг");
                break;
            case 5:
                nedField.setText("Пятница");
                break;
            case 6:
                nedField.setText("Суббота");
                break;
            case 7:
                nedField.setText("Воскресенье");
                break;
        }
    }
}





