package ru.alemasov.zinatullina_doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField kolvoField;

    @FXML
    private TextField resField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        {
            int n = Integer.parseInt(kolvoField.getText());
            if (n<10||n>40){
                resField.setText("Не в диапозоне");
                return;
            }
                String res = "";
                String[] units = {"", "одно", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
                String[] tens1 = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать",
                        "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
                String[] tens2 = {"", "", "двадцать", "тридцать", "сорок"};
                String[] ones = {"не в диапозоне"};


                if (n >= 10 && n <= 19) {
                    res += tens1[n % 10];
                } else {
                    res += tens2[n / 10];
                    res += "" + units[n % 10];
                }
                if (n % 10 == 1 && n != 11) {
                    res += "" + "учебное задание";
                } else {
                    res += "" + "учебных заданий";
                }


                resField.setText(res);


            }

        }
    }
