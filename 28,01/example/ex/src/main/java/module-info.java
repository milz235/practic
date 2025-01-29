module ru.alemasov.ex {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.ex to javafx.fxml;
    exports ru.alemasov.ex;
    exports ru.alemasov.ex.controller;
    opens ru.alemasov.ex.controller to javafx.fxml;
}