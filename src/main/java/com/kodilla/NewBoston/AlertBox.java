package com.kodilla.NewBoston;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {


    static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        Label label = new Label(message);

        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        Button noButton = new Button("No");
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        window.setOnCloseRequest(e-> closeWindow());

        FlowPane layout = new FlowPane(Orientation.HORIZONTAL);
        layout.getChildren().addAll(label, yesButton, noButton);
        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }

    public static void closeWindow(){
        answer = false;

    }
}
