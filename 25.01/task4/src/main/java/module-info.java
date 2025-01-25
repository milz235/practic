module ru.alemasov.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.task4 to javafx.fxml;
    exports ru.alemasov.task4;
}