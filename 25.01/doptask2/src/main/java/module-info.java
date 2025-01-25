module ru.alemasov.doptask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.doptask2 to javafx.fxml;
    exports ru.alemasov.doptask2;
}