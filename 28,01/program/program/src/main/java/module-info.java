module ru.alemasov.program {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.program to javafx.fxml;
    exports ru.alemasov.program;
    exports ru.alemasov.program.Controller;
    opens ru.alemasov.program.Controller to javafx.fxml;
}