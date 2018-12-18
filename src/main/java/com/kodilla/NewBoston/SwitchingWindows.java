package com.kodilla.NewBoston;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SwitchingWindows extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children are laid out in the vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        //Button 2
        Label label2 = new Label("Welcome to the second scene");
        Button button2 = new Button("This scene sucks, go back to scene one");
        button2.setOnAction(e -> window.setScene(scene1));

        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 500, 300);

        window.setScene(scene1);
        window.setTitle("Title");
        window.show();







    }


}
