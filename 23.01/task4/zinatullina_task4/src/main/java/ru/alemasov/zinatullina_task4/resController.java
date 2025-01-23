package ru.alemasov.zinatullina_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class resController {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private Button yButton;

    @FXML
    private TextField yField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(aField.getText());
        int B = Integer.parseInt(bField.getText());
        int C = Integer.parseInt(cField.getText());
        double M = A + pow(B, 2) / (C * 1.0f);
        int k = (int) (M%3);
        double y = 0;
        switch (k){
            case 0:
                y = exp(M+C);
                break;
            case 1:
                y = log((double) A/B);
                break;
            case 2:
                y = sqrt(abs(pow(A + B, 2) + C));
                break;
        }
        yField.setText("" + y);

    }

}
