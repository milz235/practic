module ru.alemasov.zinatullina_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullina_task1 to javafx.fxml;
    exports ru.alemasov.zinatullina_task1;
}