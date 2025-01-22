package ru.alemasov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField danoField;

    @FXML
    private Button resButton;

    @FXML
    private TextField resultField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        String data = danoField.getText();
        String result = "";
        char[] symbols= data.toCharArray();
        for (int i = symbols.length - 1; i >= 0; i--){
            result += symbols[i];
        }
        resultField.setText(result);

    }

}
