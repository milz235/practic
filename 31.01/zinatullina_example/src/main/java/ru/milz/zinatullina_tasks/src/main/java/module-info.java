module ru.milz.zinatullina_tasks {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.milz.zinatullina_tasks to javafx.fxml;
    exports ru.milz.zinatullina_tasks;
}