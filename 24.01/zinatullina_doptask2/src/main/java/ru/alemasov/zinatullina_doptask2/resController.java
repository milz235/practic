package ru.alemasov.zinatullina_doptask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField resField;

    @FXML
    private TextField vozField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(vozField.getText());
        if (n<100||n>999){
            resField.setText("Не в диапозоне");
            return;
        }
        String res = "";
        String[] ones = {"","один","два","три","четыре","пять",
                "шесть","семь","восемь","девять"};
        String[] tens1 = {"","одинадцать","двенадцать","тринадцать","четырнадцать",
                "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};
        String[] tens2 = {"", "", "двадцать",
                "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                "восемьдесят", "девяносто"};
        String[] hund = { "", "сто", "двести", "триста",
                "четыреста", "пятьсот", "шестьсот", "семьсот",
                "восемьсот", "девятьсот"};
        if (n/10%10!=1){
            res += hund[n/100]+""+tens2[n/10%10]+""+ones[n%10];
        }
        else{
            res += hund[n/100]+""+tens1[n%10];
        }
        resField.setText(res);

    }

}
