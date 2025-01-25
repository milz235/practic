package ru.alemasov.zinatullinatask4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField chisField;

    @FXML
    private TextField kField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(chisField.getText());

        if (n <= 0) {
            kField.setText("N должно быть больше 0.");
            return;
        }

        int k = 0;
        while ((k + 1) * (k + 1) <= n) {
            k++;
        }

        kField.setText("" + k);


    }

    }


