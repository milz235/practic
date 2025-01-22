package ru.alemasov.zinatullinamilana_doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField cvField;

    @FXML
    private TextField ostField;

    @FXML
    private Button resField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(aField.getText());
        int B = Integer.parseInt(bField.getText());
        int C = Integer.parseInt(cField.getText());
        cvField.setText("" + (A*B / (C * 4)));
        ostField.setText("" + (A*B % (C * 4)));

    }

}
