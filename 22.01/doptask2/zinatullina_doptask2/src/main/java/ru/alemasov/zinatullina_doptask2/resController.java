package ru.alemasov.zinatullina_doptask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField godField;

    @FXML
    private Button resButton;

    @FXML
    private TextField vekField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int god = Integer.parseInt(godField.getText());
        if (god % 100 == 0)
            vekField.setText("" + (god / 100));
        else
            vekField.setText("" + (god / 100 + 1));

    }

}
