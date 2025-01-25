module ru.alemasov.zinatullinatask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullinatask2 to javafx.fxml;
    exports ru.alemasov.zinatullinatask2;
}