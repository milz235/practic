package ru.alemasov.ex.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.alemasov.ex.HelloApplication;

import java.io.IOException;

public class Manager {
    public static Stage mainStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    public static void showMainStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlloader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlloader.load(), 800, 600);
            stage.setScene((scene));
            stage.setTitle(title);

            stage.setMaximized(false);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSecondStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 800,600);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
