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


public class YoutubeClass extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;

        button = new Button();
        button.setText("click me to go to next window");
        button.setOnAction(e-> {
            boolean result = AlertBox.display("Second window", "R u sure 2 send me these fiies?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

}
