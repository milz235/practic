module ru.alemasov.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.task3 to javafx.fxml;
    exports ru.alemasov.task3;
}