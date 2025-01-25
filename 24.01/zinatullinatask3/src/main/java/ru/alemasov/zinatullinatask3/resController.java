package ru.alemasov.zinatullinatask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField numberField;

    @FXML
    private TextField resField;

    @FXML
    private TextField znachField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        double R, D, L, S;
        final double PI = 3.14;
        int value = Integer.parseInt(znachField.getText());
        int num = Integer.parseInt(numberField.getText());
        switch (num)
        {
            case 1:
                R = value;
                D = 2 * R;
                L = 2 * PI * R;
                S = PI * R * R;
                break;
            case 2:
                D = value;
                R = D / 2;
                L = 2 * PI * R;
                S = PI * R * R;
                break;
            case 3:
                L = value;
                R = L / (2 * PI);
                D = 2 * R;
                S = PI * R * R;
                break;
            case 4:
                S = value;
                R = Math.sqrt(S / PI);
                D = 2 * R;
                L = 2 * PI * R;
                break;
            default:
                resField.setText("Не правильный номер");
                return;
        }
        resField.setText("Радиус (R): " + R +"|"+ "\nДиаметр (D): " + D + "|"+ "\nДлина (L): " + L + "|"+ "\nПлощадь (S): " + S);
    }



}
