package com.kodilla;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<>();
    int counter = 0;

    public Deck() {
        reset();
    }

    public void reset() {
        deck.clear();

        for(Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                Card card = new Card(suit, rank, new Image(Card.getFilename(suit, rank)));
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        Card card = deck.get(counter);
        counter++;
        return card;
    }
}
