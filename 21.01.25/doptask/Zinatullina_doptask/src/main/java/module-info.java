module ru.alemasov.zinatullina_doptask {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullina_doptask to javafx.fxml;
    exports ru.alemasov.zinatullina_doptask;
}