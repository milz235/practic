package ru.alemasov.zinatullina_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class resController {

    @FXML
    private TextField ddField;

    @FXML
    private TextField mmField;

    @FXML
    private Button resButton;

    @FXML
    private TextField resField;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int DD = Integer.parseInt(ddField.getText());
        int MM = Integer.parseInt(mmField.getText());
        LocalDate date = LocalDate.of(2025, MM, DD);

        LocalDate previousDate = date.minusDays(1);

        int previousDD = previousDate.getDayOfMonth();
        int previousMM = previousDate.getMonthValue();

        resField.setText("День: " + previousDD + ", Месяц: " + previousMM);
    }

    }


