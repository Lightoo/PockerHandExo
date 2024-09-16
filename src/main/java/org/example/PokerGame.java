package org.example;

import org.example.rules.PokerRule;

import java.util.List;

public class PokerGame {
    private final List<PokerRule> pokerRules;

    public PokerGame(PokerRule... pokerRules) {
        this.pokerRules = List.of(pokerRules);
    }

    public String play(Player player1, Player player2){
        return null;
    }
}
