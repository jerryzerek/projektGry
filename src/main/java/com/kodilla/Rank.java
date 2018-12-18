package com.kodilla;

public enum Rank {
    ACE( "Ace", "a", 1),
    TWO( "Two", "2", 2 ),
    THREE( "Three", "3", 3 ),
    FOUR( "Four", "4", 4 ),
    FIVE( "Five", "5", 5 ),
    SIX( "Six", "6", 6),
    SEVEN( "Seven", "7", 7 ),
    EIGHT( "Eight", "8", 8 ),
    NINE( "Nine", "9", 9 ),
    TEN( "Ten", "T", 10 ),
    JACK( "Jack", "J", 10 ),
    QUEEN( "Queen", "Q", 10 ),
    KING( "King", "K", 10 );

    private String name;
    private String symbol;
    private int rankValue;

    Rank( String nameValue, String symbolValue, int rankValue ) {
        name = nameValue;
        symbol = symbolValue;
        this.rankValue = rankValue;
    }

    public String getName() {
        return name;
    }

    public int getRankValue() {
        return rankValue;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}