package ru.alemasov.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class resController {

    @FXML
    private TextField kField;

    @FXML
    private TextField nField;

    @FXML
    private Label nLabel;

    @FXML
    void okButtonOnAction(ActionEvent event) {
        int k = Integer.parseInt(kField.getText());
        int n = Integer.parseInt(nField.getText());
        double r = 0;
        for (int i=1;i<=n;i++){
            r=r+pow(i,k);
        }
        nLabel.setText(String.valueOf(r));

    }

}
