package ru.alemasov.zinatullina_task2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class reshController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnResh;

    @FXML
    private TextField xTextField;

    @FXML
    private Label yLabel;

    @FXML
    void reshButtonOnAction(ActionEvent event) {
        float x=Float.parseFloat(xTextField.getText().toString());
        double y = 3*pow(x,6)-6*pow(x,2)-7;
        yLabel.setText("y="+y);

    }

    @FXML
    void initialize() {
        assert btnResh != null : "fx:id=\"btnResh\" was not injected: check your FXML file 'resh-view.fxml'.";
        assert xTextField != null : "fx:id=\"xTextField\" was not injected: check your FXML file 'resh-view.fxml'.";
        assert yLabel != null : "fx:id=\"yLabel\" was not injected: check your FXML file 'resh-view.fxml'.";

    }

}
