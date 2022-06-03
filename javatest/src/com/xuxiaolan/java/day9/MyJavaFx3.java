package com.xuxiaolan.java.day9;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyJavaFx3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");
        pane.getChildren().add(text);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("keyEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

        text.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case DOWN:
                    text.setY(text.getY() + 10);
                    System.out.println("下");
                    break;
                case UP:
                    text.setY(text.getY() - 10);
                    System.out.println("上");
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    System.out.println("左");
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                    System.out.println("右");
                    ;
                    break;
            }
        });
        text.requestFocus();
    }
}
