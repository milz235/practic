package ru.alemasov.zinatullinatask6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField nField;

    @FXML
    private TextField sevField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nField.getText());
        if (n <= 0) {
            nField.setText("N должно быть больше 0.");
            return;
        }

        boolean cs = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 7) {
                cs = true;
                break;
            }
            n=n/10;
        }

        sevField.setText(String.valueOf(cs));


    }

}
