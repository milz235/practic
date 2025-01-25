module ru.alemasov.zinatullinatask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullinatask3 to javafx.fxml;
    exports ru.alemasov.zinatullinatask3;
}