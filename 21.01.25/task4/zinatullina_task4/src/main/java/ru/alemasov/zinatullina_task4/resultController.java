package ru.alemasov.zinatullina_task4;


import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import static java.lang.Math.exp;
import static java.lang.Math.sin;

public class resultController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aTextField;

    @FXML
    private Button resultbtn;

    @FXML
    private TextField yResult;

    @FXML
    void resultButtonOnAction(ActionEvent event) {
        double A = Double.parseDouble(aTextField.getText());
        double x = A / 12f;
        double b = exp(-A * x);
        double y = 1 - exp(-A * x) * sin(A * x + b);
        yResult.setText(""+y);

    }

    @FXML
    void initialize() {
        assert aTextField != null : "fx:id=\"aTextField\" was not injected: check your FXML file 'result-view.fxml'.";
        assert resultbtn != null : "fx:id=\"resultbtn\" was not injected: check your FXML file 'result-view.fxml'.";
        assert yResult != null : "fx:id=\"yResult\" was not injected: check your FXML file 'result-view.fxml'.";

    }

}
