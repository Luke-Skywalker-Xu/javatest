package com.xuxiaolan.java.day11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TestXXOO extends Application {

    private char whoseTurn = 'X';

    private final Cell[][] cells = new Cell[3][3];

    private final Label lblStatus = new Label("X的回合");

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pane.add(cells[i][j] = new Cell(), j, i);
            }
        }

        Button button = new Button("再来一局");
        BorderPane borderPaneForButton = new BorderPane();
        borderPaneForButton.setCenter(lblStatus);
        borderPaneForButton.setRight(button);

        lblStatus.setPadding(new Insets(5));

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(borderPaneForButton);

        button.setOnAction(event -> {
            pane.getChildren().clear();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    pane.add(cells[i][j] = new Cell(), j, i);
                }
            }
            whoseTurn = 'X';
            lblStatus.setText("X的回合");
        });

        Scene scene = new Scene(borderPane, 450, 460);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public boolean isFill() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j].getToken() == ' ') {
                    return false;
                }

            }
        }
        return true;
    }

    public boolean isWon(char token) {
        for (int i = 0; i < 3; i++) {
            if (cells[i][0].getToken() == token
                    && cells[i][1].getToken() == token
                    && cells[i][2].getToken() == token) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cells[0][i].getToken() == token
                    && cells[1][i].getToken() == token
                    && cells[2][i].getToken() == token) {
                return true;
            }
        }
        if (cells[0][0].getToken() == token
                && cells[1][1].getToken() == token
                && cells[2][2].getToken() == token) {
            return true;
        }
        if (cells[2][0].getToken() == token
                && cells[1][1].getToken() == token
                && cells[0][2].getToken() == token) {
            return true;
        }

        return false;
    }

    public class Cell extends Pane {
        private char token = ' ';

        //constructor
        public Cell() {
            setStyle(" -fx-border-color: black");
            this.setPrefSize(2000, 2000);
            this.setOnMouseClicked(event -> handleMouseClick());
        }

        //getter and setter
        public char getToken() {
            return token;
        }


        public void setToken(char c) {
            token = c;

            if (token == 'X') {
                Line line1 = new Line(10, 10, this.getWidth() - 10, this.getHeight() - 10);
                line1.endXProperty().bind(this.widthProperty().subtract(10));
                line1.endYProperty().bind(this.heightProperty().subtract(10));
                Line line2 = new Line(10, this.getHeight() - 10, this.getWidth() - 10, 10);
                line2.startYProperty().bind(this.heightProperty().subtract(10));
                line2.endXProperty().bind(this.widthProperty().subtract(10));

                this.getChildren().addAll(line1, line2);
            } else if (token == 'O') {
                Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2,
                        this.getWidth() / 2 - 10, this.getHeight() / 2 - 10);
                ellipse.centerXProperty().bind(this.widthProperty().divide(2));
                ellipse.centerYProperty().bind(this.heightProperty().divide(2));
                ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
                ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
                ellipse.setFill(Color.PINK);
                ellipse.setStroke(Color.BLACK);

                this.getChildren().add(ellipse);
            }

        }

        //处理鼠标点击
        private void handleMouseClick() {

            if (token == ' ' && whoseTurn != ' ') {
                setToken(whoseTurn);


                if (isWon(whoseTurn)) {
                    lblStatus.setText(whoseTurn + " 赢得了比赛!游戏结束!");
                    whoseTurn = ' ';
                } else if (isFill()) {
                    lblStatus.setText("平局!游戏结束!");
                    whoseTurn = ' ';
                } else {
                    whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                    lblStatus.setText(whoseTurn + "的回合");
                }
            }
        }


    }
    public static void main(String[] args) {
        launch(args);
    }
}

