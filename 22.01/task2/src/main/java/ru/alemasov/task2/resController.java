package ru.alemasov.task2;

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
        char[] symbols = data.toCharArray();
        resultField.setText(""+symbols[1]+symbols[0]+symbols[2]);

    }

}
