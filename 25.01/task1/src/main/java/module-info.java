module ru.alemasov.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.task1 to javafx.fxml;
    exports ru.alemasov.task1;
}