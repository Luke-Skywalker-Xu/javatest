package com.xuxiaolan.java.day8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class MyJavaFx2 extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage stage) {
    Scene scene1 = new Scene(new Group(), 450, 250);

    TextField notification = new TextField ();
    notification.setText("Label");

    notification.clear();

    GridPane grid = new GridPane();
    grid.setVgap(4);
    grid.setHgap(10);
    grid.setPadding(new Insets(5, 5, 5, 5));
    grid.add(new Label("To: "), 0, 0);
    grid.add(notification, 1, 0);

    Group root = (Group) scene1.getRoot();
    root.getChildren().add(grid);
    stage.setScene(scene1);
    stage.show();
  }
}

