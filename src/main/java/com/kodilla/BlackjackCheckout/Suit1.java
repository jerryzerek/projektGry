package com.kodilla.BlackjackCheckout;

public enum Suit1 {
    SPADES ("Spades", "S"),
    HEARTS ("Hearts", "H"),
    CLUBS ("Clubs", "C"),
    DIAMONDS ("Diamonds", "D");

    private String name;
    private String symbol;

    Suit1(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name;
    }
}
