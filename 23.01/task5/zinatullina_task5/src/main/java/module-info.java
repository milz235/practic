module ru.alemasov.zinatullina_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullina_task5 to javafx.fxml;
    exports ru.alemasov.zinatullina_task5;
}