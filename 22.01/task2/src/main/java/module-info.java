module ru.alemasov.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.task2 to javafx.fxml;
    exports ru.alemasov.task2;
}