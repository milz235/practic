package ru.alemasov.zinatullinatask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField age2Field;

    @FXML
    private TextField ageField;

    @FXML
    void resButtonOnAction(ActionEvent event)
    {int age = Integer.parseInt(ageField.getText());
        String[] units = {
                "", "один", "два", "три", "четыре", "пять",
                "шесть", "семь", "восемь", "девять"
        };
        String[] tens = {
                "", "", "двадцать", "тридцать",
                "сорок", "пятьдесят", "шестьдесят"
        };
        String description = tens[age / 10] + " ";


       if (age % 10 != 0) {
            description += units[age % 10] + " ";
        }
        int lastDigit = age % 10;
        if (lastDigit == 1 && age != 11) {
            description += "год";
        } else if (lastDigit >= 2 && lastDigit <= 4 && (age < 12 || age > 14)) {
            description += "года";
        } else {
            description += "лет";
        }
        age2Field.setText(description.trim());
        if (age < 20 || age > 69) {
            age2Field.setText("Не в диапозоне");}

    }



}
