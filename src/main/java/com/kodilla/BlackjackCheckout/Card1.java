package com.kodilla.BlackjackCheckout;


import javafx.scene.image.Image;

public class Card1 {
    private Suit1 suit;
    private Rank1 rankValue;
    private Image cardFace;

    public Card1(Suit1 suit, Rank1 rankValue, Image cardFace) {
        this.suit = suit;
        this.rankValue = rankValue;
        this.cardFace = cardFace;
    }

    public static String getFilename (Suit1 suit, Rank1 rank ){
        return "file:src/main/resources/images/cards1" + suit.getSymbol()+rank.getSymbol()+"png";
    }

    public Suit1 getSuit() {
        return suit;
    }

    public Rank1 getRankValue() {
        return rankValue;
    }

    public Image getCardFace() {
        return cardFace;
    }

    public int getValue() {
        String rank = rankValue.getSymbol();
        try {
            return Integer.parseInt(rank);
        } catch (Exception ex) {
            if (rank.equals("a")) {
                return 11;
            } else {
                return 10;
            }
        }
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
