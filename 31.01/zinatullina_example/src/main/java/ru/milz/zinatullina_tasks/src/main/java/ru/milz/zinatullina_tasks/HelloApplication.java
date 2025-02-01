package ru.milz.zinatullina_tasks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

import static java.lang.Math.*;


public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;


    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = cscene1();
        scene2 = cscene2();
        scene3 = cscene3();
        scene4 = cscene4();
        primaryStage.setTitle("Практическая работа 1");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene cscene1() {
        Label labelTitle = new Label("Задание 1");
        labelTitle.setStyle("-fx-font-size:20px;-fx-font-weight:bond;");
        TextField aField = new TextField();
        TextField bField = new TextField();
        Button resbtn = new Button("Расчёт");
        Label resultLabel = new Label();

        resbtn.setOnAction(www -> {
            try {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                double c = Math.sqrt(pow(a, 2) + pow(b, 2));
                double p = a + b + c;
                resultLabel.setText("C=" + c + "\n P=" + p);
            } catch (NumberFormatException e) {
                resultLabel.setText("ERROR!");
            }

        });
        Button oneButton = new Button("1");
        Button twoButton = new Button("2");
        Button threeButton = new Button("3");
        Button fourButton = new Button("4");
        oneButton.setOnAction(event -> primaryStage.setScene(scene1));
        twoButton.setOnAction(event -> primaryStage.setScene(scene2));
        threeButton.setOnAction(event -> primaryStage.setScene(scene3));
        fourButton.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root1 = new HBox(10, oneButton, twoButton, threeButton, fourButton);
        root1.setAlignment(Pos.CENTER);
        HBox root2 = new HBox(10, new Label("a="), aField, new Label("b="), bField);
        root2.setAlignment(Pos.CENTER);
        VBox root3 = new VBox(20, labelTitle, root2, resbtn, resultLabel, root1);
        root3.setAlignment(Pos.CENTER);
        root3.setPadding(new Insets(20));
        return new Scene(root3, 500, 500);

        }
        private Scene cscene2 () {
            Label labelTitle = new Label("Задание 2");
            labelTitle.setStyle("-fx-font-size:20px;-fx-font-weight:bond;");
            TextField xField = new TextField();
            Button resbtn = new Button("Расчёт");
            Label resultLabel = new Label();

            resbtn.setOnAction(www -> {
                try {
                    int x = Integer.parseInt(xField.getText());
                    double y = 3 * pow(x, 6) - 6 * pow(x, 2) - 7;
                    resultLabel.setText("y=" + y);
                } catch (NumberFormatException e) {
                    resultLabel.setText("ERROR!");
                }
            });
            Button oneButton = new Button("1");
            Button twoButton = new Button("2");
            Button threeButton = new Button("3");
            Button fourButton = new Button("4");
            oneButton.setOnAction(event -> primaryStage.setScene(scene1));
            twoButton.setOnAction(event -> primaryStage.setScene(scene2));
            threeButton.setOnAction(event -> primaryStage.setScene(scene3));
            fourButton.setOnAction(event -> primaryStage.setScene(scene4));
            HBox root1 = new HBox(10, oneButton, twoButton, threeButton, fourButton);
            root1.setAlignment(Pos.CENTER);
            HBox root2 = new HBox(10, new Label("x="), xField);
            root2.setAlignment(Pos.CENTER);
            VBox root3 = new VBox(20, labelTitle, root2, resbtn, resultLabel, root1);
            root3.setAlignment(Pos.CENTER);
            root3.setPadding(new Insets(20));
            return new Scene(root3, 500, 500);


        }
        private Scene cscene3 () {
            Label labelTitle = new Label("Задание 3");
            labelTitle.setStyle("-fx-font-size:20px;-fx-font-weight:bond;");
            TextField aField = new TextField();
            Button resbtn = new Button("Расчёт");
            Label resultLabel = new Label();

            resbtn.setOnAction(www -> {
                try {
                    int a = Integer.parseInt(aField.getText());
                    double a2 = a * a;
                    double a4 = a2 * a2;
                    double a8 = a4 * a4;
                    resultLabel.setText("A2=" + a2 + "\nА4=" + a4 + "\nA8=" + a8);
                } catch (NumberFormatException e) {
                    resultLabel.setText("ERROR!");
                }
            });
            Button oneButton = new Button("1");
            Button twoButton = new Button("2");
            Button threeButton = new Button("3");
            Button fourButton = new Button("4");
            oneButton.setOnAction(event -> primaryStage.setScene(scene1));
            twoButton.setOnAction(event -> primaryStage.setScene(scene2));
            threeButton.setOnAction(event -> primaryStage.setScene(scene3));
            fourButton.setOnAction(event -> primaryStage.setScene(scene4));
            HBox root1 = new HBox(10, oneButton, twoButton, threeButton, fourButton);
            root1.setAlignment(Pos.CENTER);
            HBox root2 = new HBox(10, new Label("А="), aField);
            root2.setAlignment(Pos.CENTER);
            VBox root3 = new VBox(20, labelTitle, root2, resbtn, resultLabel, root1);
            root3.setAlignment(Pos.CENTER);
            root3.setPadding(new Insets(20));
            return new Scene(root3, 500, 500);

        }
        public static void main (String[]args){
            launch();
        }
        private Scene cscene4 () {
            Label labelTitle = new Label("Задание 4");
            labelTitle.setStyle("-fx-font-size:20px;-fx-font-weight:bond;");
            TextField aField = new TextField();
            Button resbtn = new Button("Расчёт");
            Label resultLabel = new Label();

            resbtn.setOnAction(www -> {
                try {
                    double A = Double.parseDouble(aField.getText());
                    double x = A / 12f;
                    double b = exp(-A * x);
                    double y = 1 - exp(-A * x) * sin(A * x + b);
                    resultLabel.setText("Y=" + y);

                } catch (NumberFormatException e) {
                    resultLabel.setText("ERROR!");
                }

            });
            Button oneButton = new Button("1");
            Button twoButton = new Button("2");
            Button threeButton = new Button("3");
            Button fourButton = new Button("4");
            oneButton.setOnAction(event -> primaryStage.setScene(scene1));
            twoButton.setOnAction(event -> primaryStage.setScene(scene2));
            threeButton.setOnAction(event -> primaryStage.setScene(scene3));
            fourButton.setOnAction(event -> primaryStage.setScene(scene4));
            HBox root1 = new HBox(10, oneButton, twoButton, threeButton, fourButton);
            root1.setAlignment(Pos.CENTER);
            HBox root2 = new HBox(10, new Label("А="), aField);
            root2.setAlignment(Pos.CENTER);
            VBox root3 = new VBox(20, labelTitle, root2, resbtn, resultLabel, root1);
            root3.setAlignment(Pos.CENTER);
            root3.setPadding(new Insets(20));
            return new Scene(root3, 500, 500);

        }


    }
