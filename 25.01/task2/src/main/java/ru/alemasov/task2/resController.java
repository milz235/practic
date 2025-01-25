package ru.alemasov.task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class resController {

    @FXML
    private TextField aField;

    @FXML
    private Label answerLabel;

    @FXML
    private TextField bField;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<?> dataListView;

    @FXML
    private Button okButton;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        int count = 0;
        int a = Integer.parseInt(aField.getText());
        int b = Integer.parseInt(bField.getText());
        for (int i = a; i <=b;i++){
            if (i%2==0){
                count++;
            }
            if (count>0){
                answerLabel.setText(""+count);
            }else {
                answerLabel.setText("Нет чётных чисел на данном отрезке");
            }

        }

    }

}
