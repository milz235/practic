module ru.milz.tasks {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.milz.tasks to javafx.fxml;
    exports ru.milz.tasks;
}