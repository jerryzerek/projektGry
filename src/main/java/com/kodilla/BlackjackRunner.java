package com.kodilla;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;



public class BlackjackRunner extends Application {
    private final Deck deck = new Deck();
//    private final Hand dealer = new Hand();
//    private final Hand hand = new Hand();

    FlowPane cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane dealerCards = new FlowPane(Orientation.HORIZONTAL);
    Label totalLabel = new Label();
    Label totalLabelDealer = new Label();

    Label dealerLbl = new Label("Dealer Hand");
    Label playelLbl = new Label("Your hand");

    public void drawCard (Hand hand, FlowPane pane, Label l) {
        Card card = deck.drawCard();
        ImageView img = new ImageView(card.getCardImage());

    }








    public static void main(String[] args) {
        launch(args);
    }
}
