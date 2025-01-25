package ru.alemasov.zinatullina_doptask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField hodField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aField.getText());
        int b = Integer.parseInt(bField.getText());
        if (a <=0 ||b<=0){
            hodField.setText("Введите положительное число");
            return;
        }
        while (b!=0){
            int temp = b;
            b=a%b;
            a = temp;
        }
        hodField.setText(""+a);

    }

}
