module ru.alemasov.zinatullinatask4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullinatask4 to javafx.fxml;
    exports ru.alemasov.zinatullinatask4;
}