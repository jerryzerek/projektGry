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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Gridpane extends Application{

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Opening window");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label name = new Label("username:");
        TextField nameInput = new TextField("jerryzerek");
        Label password = new Label("password:");
        TextField passwordInput = new TextField();
        Button loginButton = new Button();
        loginButton.setText("Log in");

        grid.add(name, 0, 0);
        grid.add(nameInput,1, 0);
        grid.add(passwordInput, 1, 1);
        grid.add(password,0, 1);
        grid.add(loginButton,1,2);


        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }

}
