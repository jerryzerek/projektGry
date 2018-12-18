package com.kodilla.BlackjackCheckout;

public enum Rank1 {

    ACE("Ace", "a"),
    TWO("Two", "2"),
    THREE( "Three", "3"),
    FOUR( "Four", "4"),
    FIVE( "Five", "5"),
    SIX( "Six", "6"),
    SEVEN( "Seven", "7"),
    EIGHT( "Eight", "8"),
    NINE( "Nine", "9"),
    TEN( "Ten", "T"),
    JACK( "Jack", "J"),
    QUEEN( "Queen", "Q"),
    KING( "King", "K");

    private String name;
    private String symbol;

    Rank1(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }


}
