package com.kodilla;


public enum Suit{

    SPADES ("Spades", "S"),
    HEARTS ("Hearts", "H"),
    CLUBS ("Clubs", "C"),
    DIAMONDS ("Diamonds", "D");


    private String name;
    private String symbol;

    Suit( String nameValue, String symbolValue ) {
        name = nameValue;
        symbol = symbolValue;
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




