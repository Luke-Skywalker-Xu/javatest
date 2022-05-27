package com.xuxiaolan.java.day8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyJavaFx6 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MyJavaFx");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.PINK) ;
        Text text = new Text(100, 100, "MyJavaFx");
        text.setFill(new Color(0.1,0.2,0.3,0.7));
        text.setRotate(60);
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
        root.getChildren().add(text);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

