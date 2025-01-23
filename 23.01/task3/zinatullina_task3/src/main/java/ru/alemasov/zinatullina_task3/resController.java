package ru.alemasov.zinatullina_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class resController {

    @FXML
    private TextField c1Field;

    @FXML
    private TextField c2Field;

    @FXML
    private TextField c3Field;

    @FXML
    private Button maxButton;

    @FXML
    private TextField maxField;

    @FXML
    private Button minButton;

    @FXML
    private TextField minField;

    @FXML
    void maxButtonOnAction(ActionEvent event) {
        int[] numbers = {Integer.parseInt(c1Field.getText()), Integer.parseInt(c2Field.getText()), Integer.parseInt(c3Field.getText())};
        maxField.setText("" + Arrays.stream(numbers).max().getAsInt());

    }

    @FXML
    void minButtonOnAction(ActionEvent event) {
        int[] numbers = {Integer.parseInt(c1Field.getText()), Integer.parseInt(c2Field.getText()), Integer.parseInt(c3Field.getText())};
        minField.setText("" + Arrays.stream(numbers).min().getAsInt());

    }

}
