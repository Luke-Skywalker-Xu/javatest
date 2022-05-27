package com.xuxiaolan.java.day8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx1 extends Application {

    @Override
    public void start(Stage primaryStage)  {
        Button btOK=new Button("OK");
        Scene scene=new Scene(btOK,200,250);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage =new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage")));
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
