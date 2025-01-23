package ru.alemasov.zinatullina_doptask1;

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
    private TextField vidField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(chisField.getText());
        if (number==0){
            vidField.setText("Равное нулю");
        }else if (number>0){
            if (number%2==0){
                vidField.setText("Положительное чётное число");
            }else {
                vidField.setText("Положительное нечётное число");
            }
        }else {
            if (number%2==0){
                vidField.setText("Отрицательное чётное число");
            }else {
                vidField.setText("Отрицательное нечётное число");
            }
        }

        }


    }


