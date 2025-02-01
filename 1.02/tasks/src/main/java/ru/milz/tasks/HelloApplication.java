package ru.milz.tasks;

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
import java.util.Scanner;

import static java.lang.Math.pow;


public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private java.lang.String String;
    private java.lang.String res;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage=stage;
        scene1=cscene1();
        scene2=cscene2();
        scene3=cscene3();
        primaryStage.setTitle("Практическая 8");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }




    private Scene cscene1() {
        Label titleLabel = new Label("Задание 1");
        TextField aField = new TextField();
        TextField bField = new TextField();
        Button resbtn=new Button("Расчёт");
        Label reaLabel = new Label();

        resbtn.setOnAction(www->{
            try {
                String s = "";
                int A = Integer.parseInt(aField.getText());
                int B = Integer.parseInt(bField.getText());
                for (int i = 0; i <= A; i+=B){
                    s += " " + i;
                }
                reaLabel.setText(s);

            }
            catch (NumberFormatException e){
                reaLabel.setText("ERROR!!");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        btn1.setOnAction(evet->primaryStage.setScene(scene1));
        btn2.setOnAction(evet->primaryStage.setScene(scene2));
        btn3.setOnAction(evet->primaryStage.setScene(scene3));
        HBox root1 = new HBox(10,btn1,btn2,btn3);
        root1.setAlignment(Pos.CENTER);
        HBox root2 = new HBox(10,new Label("A="),aField,new Label("B="),bField);
        root2.setAlignment(Pos.CENTER);
        VBox root3 = new VBox(20,titleLabel,root2,resbtn,reaLabel,root1);
        root3.setAlignment(Pos.CENTER);
        root3.setPadding(new Insets(20));
        return new Scene(root3,500,500);
    }
    private Scene cscene2() {
        Label titleLabel = new Label("Задание 2");
        TextField aField = new TextField();
        TextField bField = new TextField();
        TextField сField = new TextField();
        Button resbtn=new Button("Расчёт");
        Label reaLabel = new Label();

        resbtn.setOnAction(www->{
            try {
                int A = Integer.parseInt(aField.getText());
                int B = Integer.parseInt(bField.getText());
                int C= Integer.parseInt(сField.getText());
                int pr1 = A * B;
                int pr2 = B * C;
                int[] pr = {pr1,pr2};
                java.util.Arrays.sort(pr);
                reaLabel.setText("В порядке возрастания:" + pr[0]+pr[1]);
            }
            catch (NumberFormatException e){
                reaLabel.setText("ERROR!!");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        btn1.setOnAction(evet->primaryStage.setScene(scene1));
        btn2.setOnAction(evet->primaryStage.setScene(scene2));
        btn3.setOnAction(evet->primaryStage.setScene(scene3));
        HBox root1 = new HBox(10,btn1,btn2,btn3);
        root1.setAlignment(Pos.CENTER);
        HBox root2 = new HBox(10,new Label("A="),aField,new Label("B="),bField, new Label("C="),сField);
        root2.setAlignment(Pos.CENTER);
        VBox root3 = new VBox(20,titleLabel,root2,resbtn,reaLabel,root1);
        root3.setAlignment(Pos.CENTER);
        root3.setPadding(new Insets(20));
        return new Scene(root3,600,600);
    }
    private Scene cscene3() {
        Label titleLabel = new Label("Задание 3");
        TextField xField = new TextField();
        TextField yField = new TextField();
        TextField rField = new TextField();
        TextField amField = new TextField();
        TextField anField = new TextField();
        TextField aField = new TextField();
        Button resbtn=new Button("Расчёт");
        Label reaLabel = new Label();

        resbtn.setOnAction(www->{
            try {
                int am = Integer.parseInt(amField.getText());
                int an = Integer.parseInt(anField.getText());
                int a = Integer.parseInt(aField.getText());
                int x = Integer.parseInt(xField.getText());
                int y = Integer.parseInt(yField.getText());
                int r = Integer.parseInt(rField.getText());
                if (pow(am + x, 2) + pow(an + y, 2) <= pow(r, 2) && pow(am + x, 2) + pow(an - a + y, 2) <= pow(r, 2) && pow(am - a + x, 2) + pow(an - a + y, 2) <= pow(r, 2) && pow(am - a + x, 2) + pow(an+ y, 2) <= pow(r, 2)){
                   reaLabel.setText("принадлежит");
                }else {
                    reaLabel.setText("не принадлежит");
                }
            }
            catch (NumberFormatException e){
                reaLabel.setText("ERROR!!");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        btn1.setOnAction(evet->primaryStage.setScene(scene1));
        btn2.setOnAction(evet->primaryStage.setScene(scene2));
        btn3.setOnAction(evet->primaryStage.setScene(scene3));
        HBox root1 = new HBox(10,btn1,btn2,btn3);
        root1.setAlignment(Pos.CENTER);
        HBox root2 = new HBox(10,new Label("данные квадрата:"),
                new Label ("a="),aField,new Label ("am="),amField,new Label ("an="),anField,
                new Label("данные окружности"),new Label ("x="),xField,new Label ("y="),yField,new Label ("r="),rField);
        root2.setAlignment(Pos.CENTER);
        VBox root3 = new VBox(20,titleLabel,root2,resbtn,reaLabel,root1);
        root3.setAlignment(Pos.CENTER);
        root3.setPadding(new Insets(20));
        return new Scene(root3,1000,1000);

    }

    public static void main(String[] args) {
        launch();
    }
}