package com.xuxiaolan.java.day9;

import com.xuxiaolan.java.day3.Test;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyJavaFx2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane =new Pane();
        Text text =new Text(20,20,"Programming is fun");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(event -> {
            text.setX(event.getX());
            text.setY(event.getY());
        });

        Scene scene =new Scene(pane,300,100);
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
