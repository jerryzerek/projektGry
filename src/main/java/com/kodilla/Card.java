package com.kodilla;


import javafx.scene.image.Image;

public class Card {
    private Suit suit;
    private Rank rankValue;
    private Image cardImage;

    public Card( Suit suit, Rank rankValue, Image cardFace ) {
        this.cardImage = cardFace;
        this.suit = suit;
        this.rankValue = rankValue;
    }

    public static String getFilename( Suit suit, Rank rank ) {
        return "file:src/main/resources/cards/"+rank.getSymbol() + suit.getSymbol() + ".png";
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRankValue() {
        return rankValue;
    }


    public Image getCardImage() {
        return cardImage;
    }

    @Override
    public String toString() {
        return rankValue.toString() + " of " + suit.toString();
    }

    public String rankToString() {
        return rankValue.toString();
    }

    public String suitToString() {
        return suit.toString();
    }
}