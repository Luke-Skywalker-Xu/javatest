package com.xuxiaolan.java.day9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyJavaFx1 extends Application {
    private final CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        hBox.getChildren().add(btNew);
        hBox.getChildren().add(btOpen);
        btNew.setOnAction(event -> System.out.println("New"));
        btOpen.setOnAction(event -> System.out.println("Open"));

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);
        Scene scene = new Scene(borderPane, 259, 250);
        primaryStage.setTitle("event->");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}