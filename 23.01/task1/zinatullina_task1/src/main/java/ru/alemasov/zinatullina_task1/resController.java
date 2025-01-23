package ru.alemasov.zinatullina_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField bolsheField;

    @FXML
    private TextField chisField;

    @FXML
    private Button resButton;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(chisField.getText());
        int number2 = (number/10)%10;
        int number3 = number%10;
        if (number3>number2){
            bolsheField.setText("3");
            chisField.setText(""+number3);
        }
        else if (number2>number3){
            bolsheField.setText("2");
            chisField.setText(""+number2);
        }
        else{
            bolsheField.setText("Они равны");
            chisField.setText("");
        }
    }

}
