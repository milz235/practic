module ru.alemasov.zinatulinatask5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatulinatask5 to javafx.fxml;
    exports ru.alemasov.zinatulinatask5;
}