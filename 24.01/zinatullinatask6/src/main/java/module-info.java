module ru.alemasov.zinatullinatask6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullinatask6 to javafx.fxml;
    exports ru.alemasov.zinatullinatask6;
}