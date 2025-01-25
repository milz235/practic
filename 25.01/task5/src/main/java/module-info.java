module ru.alemasov.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.task5 to javafx.fxml;
    exports ru.alemasov.task5;
}