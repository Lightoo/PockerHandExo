package org.example;

import org.example.rules.PokerRule;

import java.util.List;
import java.util.Optional;

public class PokerGame {
    private final List<PokerRule> pokerRules;

    public PokerGame(PokerRule... pokerRules) {
        this.pokerRules = List.of(pokerRules);
    }

    public String play(Player player1, Player player2){
        Score score1 = pokerRules.stream()
                .filter(rule-> rule.isTheRuleApplicable(player1.getPokerHand()))
                .map(rule-> rule.getScore(player1.getPokerHand()))
                .max(Score::compareTo).get();
        Score score2 = pokerRules.stream()
                .filter(rule-> rule.isTheRuleApplicable(player2.getPokerHand()))
                .map(rule-> rule.getScore(player2.getPokerHand()))
                .max(Score::compareTo).get();
        if(score1.compareTo(score2)>0) {
            return player1.getName() + " wins. - with " + score1;
        }
        else if (score1.compareTo(score2)<0) {
            return player2.getName()+" wins. - with "+score2;
        }else {
            return "Tie.";
        }
    }
}
