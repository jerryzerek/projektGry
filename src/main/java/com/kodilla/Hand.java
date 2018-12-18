package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Hand {
    List<Card> cards = new ArrayList<>();
    private String playerNumber;
    boolean isDrawing = true;

    public Hand(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void drawCard(Deck deck) {
        Card card = deck.drawCard();
        cards.add(card);
    }

    public void drawAndWait(Deck deck) {
        while (!isLost() && isDrawing == true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Draw a card: yes or no");
            String input = in.nextLine();
            if (input.equals("yes")) {
                isDrawing = true;
                drawCard(deck);
                System.out.println("Drawing a card...the sum is now: " + calculate());
                System.out.println();
            } else if (input.equals("no")){
                isDrawing = false;
                System.out.println("Check next player");
            } else {
                System.out.println("Please type yes or no");
            }
        }
    }

    public int calculate() {
        int sumOfCards = IntStream.range(0, cards.size())
                .map(n-> cards.get(n).getRankValue().getRankValue())
                .sum();

        if (cards.stream().anyMatch(card -> card.getRankValue().equals(Rank.ACE)) && sumOfCards <=11) {
            sumOfCards+=10;

        }
        return sumOfCards;
    }


    public boolean isLost() {
        if (calculate() > 21) {
            System.out.println("You crossed 21");
            return true;
        }
        return false;
    }

    public void drawForDealer(Deck deck) {
        while (calculate() < 16) {
            drawCard(deck);
        }
    }
}




