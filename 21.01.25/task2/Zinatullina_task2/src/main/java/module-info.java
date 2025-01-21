module ru.alemasov.zinatullina_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.alemasov.zinatullina_task2 to javafx.fxml;
    exports ru.alemasov.zinatullina_task2;
}