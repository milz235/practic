package ru.alemasov.zinatullina_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField chisField;

    @FXML
    private Button resButton;

    @FXML
    private TextField resField;

    @FXML
    void recButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(chisField.getText());
        if (number>0){
            resField.setText(""+(number-8));
        }
        else if (number<0){
            resField.setText(""+(number+6));
        }
        else{
            resField.setText("10");
        }

    }

}
