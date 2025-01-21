package ru.alemasov.zinatullina_task1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class OtvetController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button btnOtvet;

    @FXML
    private Button btnOtvet2;

    @FXML
    private Label cLabel;

    @FXML
    private Label pLabel;

    @FXML
    void otv1ButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());
        double c = sqrt(pow(a,2)+pow(b,2));
        cLabel.setText("С="+c);

    }

    @FXML
    void otv2ButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());
        double c = sqrt(pow(a,2)+pow(b,2));
        double p = a+b+c;
        pLabel.setText("P="+p);
    }

    @FXML
    void initialize() {
        assert aTextField != null : "fx:id=\"aTextField\" was not injected: check your FXML file 'otvet-view.fxml'.";
        assert bTextField != null : "fx:id=\"bTextField\" was not injected: check your FXML file 'otvet-view.fxml'.";
        assert btnOtvet != null : "fx:id=\"btnOtvet\" was not injected: check your FXML file 'otvet-view.fxml'.";
        assert btnOtvet2 != null : "fx:id=\"btnOtvet2\" was not injected: check your FXML file 'otvet-view.fxml'.";
        assert cLabel != null : "fx:id=\"cLabel\" was not injected: check your FXML file 'otvet-view.fxml'.";
        assert pLabel != null : "fx:id=\"pLabel\" was not injected: check your FXML file 'otvet-view.fxml'.";

    }

}
