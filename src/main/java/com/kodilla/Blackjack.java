package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        int numberOfPlayers = 3;
        Deck deck = new Deck();
        List<Hand> players = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            Hand hand = new Hand(String.valueOf("Player" + (i)));
            players.add(hand);
        }

        for (int i = 1; i < numberOfPlayers; i++) {
            players.get(i).drawAndWait(deck);
        }
        players.get(0).drawForDealer(deck);

        for (int i = 1; i <numberOfPlayers; i++) {
            System.out.println("Player" + i + " has " + players.get(i).calculate() + " points");
        }
        System.out.println("Dealer has " + players.get(0).calculate() + " points");

        Hand winner = new Hand("");
        for (Hand hand: players) {
            if (hand.calculate() > winner.calculate() && hand.calculate() <= 21) {
                winner = hand;
            }
        }

        if(winner.equals(players.get(0))) {
            System.out.println("The winner is dealer with score " + winner.calculate());
        } else {
            System.out.println("The winner is " + winner.getPlayerNumber() + " with score " + winner.calculate());
        }

    }
}







