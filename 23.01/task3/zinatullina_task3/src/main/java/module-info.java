module ru.alemasov.zinatullina_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullina_task3 to javafx.fxml;
    exports ru.alemasov.zinatullina_task3;
}