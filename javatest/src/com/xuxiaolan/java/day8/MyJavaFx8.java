package com.xuxiaolan.java.day8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyJavaFx8 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        final TextField account = new TextField();
        account.setPromptText("账户");
        GridPane.setConstraints(account, 0, 0);
        gridPane.getChildren().add(account);

        final TextField password = new TextField();
        password.setPromptText("密码");
        GridPane.setConstraints(password, 0, 1);
        gridPane.getChildren().add(password);

        final TextField verification_code = new TextField();
        verification_code.setPromptText("验证码");
        GridPane.setConstraints(verification_code, 0, 2);
        gridPane.getChildren().add(verification_code);

        Button log = new Button("登录");
        GridPane.setConstraints(log, 1, 0);
        gridPane.getChildren().add(log);

        Button login = new Button("注册");
        GridPane.setConstraints(login, 1, 1);
        gridPane.getChildren().add(login);


        final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        gridPane.getChildren().add(label);

        Scene scene = new Scene(gridPane,500,300);
        primaryStage.setScene(scene);

        primaryStage.show();

//        primaryStage.setTitle("HBox Test");
//
//        // HBox
//        HBox hb = new HBox();
//        hb.setPadding(new Insets(15, 12, 15, 12));
//        hb.setSpacing(10);
//
//        HBox hb1 = new HBox();
//        hb1.setPadding(new Insets(50, 12, 15, 12));
//        hb1.setSpacing(10);
//
//        Label label1 = new Label("Name:");
//        TextField textField = new TextField ();
//        hb1.getChildren().addAll(label1, textField);
//        hb1.setSpacing(10);
//
//
//
//        // Buttons
//        Button btn1 = new Button();
//        btn1.setText("Button1");
//        hb.getChildren().add(btn1);
//
//        Button btn2 = new Button();
//        btn2.setText("Button2");
//        hb.getChildren().add(btn2);
//
//        Button btn3 = new Button();
//        btn3.setText("Button3");
//        hb.getChildren().add(btn3);
//
//        Button btn4 = new Button();
//        btn4.setText("Button4");
//        hb.getChildren().add(btn4);
//
//        Scene scene = new Scene(hb);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }


}
