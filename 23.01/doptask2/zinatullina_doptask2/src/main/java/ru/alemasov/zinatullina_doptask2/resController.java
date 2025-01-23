package ru.alemasov.zinatullina_doptask2;

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
        String res = "";
        if (number % 2 == 0) res += "четное ";
        else res += "нечетное ";
        if (number>= 1 && number <= 9) res += "однозначное ";
        else if (number >= 10 && number <= 99) res += "двузначное ";
        else if (number >= 100 && number <= 999) res += "трехзначное ";
        vidField.setText(""+res);


        }

    }


