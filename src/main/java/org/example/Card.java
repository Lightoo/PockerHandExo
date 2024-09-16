package org.example;

import org.example.enums.Suit;
import org.example.enums.Value;

public class Card implements Comparable<Card>{
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
