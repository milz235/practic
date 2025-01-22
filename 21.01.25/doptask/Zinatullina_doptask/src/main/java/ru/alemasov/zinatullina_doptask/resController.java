package ru.alemasov.zinatullina_doptask;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField a1TextField;

    @FXML
    private TextField a2TextField;

    @FXML
    private TextField b1TextField;

    @FXML
    private TextField b2TextField;

    @FXML
    private TextField c2TextField;

    @FXML
    private TextField cTextField;

    @FXML
    private Button resulltbtn;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void resultButtonOnAction(ActionEvent event) {
        double a1 = Double.parseDouble(a1TextField.getText());
        double a2 = Double.parseDouble(a2TextField.getText());
        double b1 = Double.parseDouble(b1TextField.getText());
        double b2 = Double.parseDouble(b2TextField.getText());
        double c1 = Double.parseDouble(cTextField.getText());
        double c2 = Double.parseDouble(c2TextField.getText());
        double d = a1 * b2 - a2 * b1;
        double x = (c1 * b2 - c2 * b1) / d;
        double y = (a1 * c2 - a2 * c1) / d;
        if (d != 0) {
            xTextField.setText("" + x);
            yTextField.setText("" + y);
        }
        else {
            xTextField.setText("Нет решения!");
            yTextField.setText("Нет решения!");
        }

    }

}
