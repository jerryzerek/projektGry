package com.kodilla.NewBoston;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label(message);

        //Create two buttons
        Button yesButton = new Button();
        yesButton.setText("Yes");
        Button noButton = new Button();
        noButton.setText("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.showAndWait();

        return answer;

    }

}
