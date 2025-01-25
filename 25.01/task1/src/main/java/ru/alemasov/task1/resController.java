package ru.alemasov.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Integer.parseInt;


public class resController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int sum = 0;
        for (int i = 0;i<data.size();i++){
            int m = data.get(i);
            if (m % 10 == 2 && m%7==0){
                sum +=m;
            }
        }
        if (sum>0){
            answerLabel.setText(String.valueOf(sum));
        }else answerLabel.setText("Чисел нет");

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {

        if (numberField.getText().isEmpty()){
            return;
        }
        try{
            int x = Integer.parseInt(numberField.getText());
            dataListView.getItems().add(x);

        }catch (NumberFormatException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены неккоректные данные");
            alert.showAndWait();
        }finally {
            numberField.setText("");
        }

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

}
