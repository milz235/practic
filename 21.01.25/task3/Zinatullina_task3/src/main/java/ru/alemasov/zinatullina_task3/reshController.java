package ru.alemasov.zinatullina_task3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class reshController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label a2Label;

    @FXML
    private Label a4Label;

    @FXML
    private Label a8Label;

    @FXML
    private TextField aTextField;

    @FXML
    private Button btnResh;

    @FXML
    void reshButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        double a2=a*a;
        double a4= a2*a2;
        double a8 = a4*a4;
        a2Label.setText("A2="+a2);
        a4Label.setText("A4="+a4);
        a8Label.setText("A8="+a8);
    }

    @FXML
    void initialize() {
        assert a2Label != null : "fx:id=\"a2Label\" was not injected: check your FXML file 'resh-view.fxml'.";
        assert a4Label != null : "fx:id=\"a4Label\" was not injected: check your FXML file 'resh-view.fxml'.";
        assert a8Label != null : "fx:id=\"a8Label\" was not injected: check your FXML file 'resh-view.fxml'.";
        assert aTextField != null : "fx:id=\"aTextField\" was not injected: check your FXML file 'resh-view.fxml'.";
        assert btnResh != null : "fx:id=\"btnResh\" was not injected: check your FXML file 'resh-view.fxml'.";

    }

}
