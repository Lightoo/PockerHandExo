package org.example;

public class Player {
    private final String name;
    private final PokerHand pokerHand;

    public Player(String name, PokerHand pokerHand) {
        this.name = name;
        this.pokerHand = pokerHand;
    }

    public String getName() {
        return name;
    }

    public PokerHand getPokerHand() {
        return pokerHand;
    }
}
