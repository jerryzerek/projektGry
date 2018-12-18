package com.kodilla.NewBoston;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class EmbeddedBoxes extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("My Main Window");

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 330);
        window.setScene(scene);
        window.show();
    }

}
