package com.xuxiaolan.java.day9;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class MyJavaFx5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane =new Pane();

        Rectangle rectangle=new Rectangle(0,0,25,50);
        rectangle.setFill(Color.ORANGE);
    }
}
