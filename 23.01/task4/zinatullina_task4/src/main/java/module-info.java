module ru.alemasov.zinatullina_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullina_task4 to javafx.fxml;
    exports ru.alemasov.zinatullina_task4;
}