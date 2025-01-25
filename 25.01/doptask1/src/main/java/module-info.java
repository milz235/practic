module ru.alemasov.doptask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.doptask1 to javafx.fxml;
    exports ru.alemasov.doptask1;
}