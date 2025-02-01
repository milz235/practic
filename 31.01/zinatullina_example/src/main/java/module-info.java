module ru.milz.zinatullina_example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.milz.zinatullina_example to javafx.fxml;
    exports ru.milz.zinatullina_example;
}