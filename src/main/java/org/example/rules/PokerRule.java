package org.example.rules;

import org.example.PokerHand;
import org.example.Score;

public interface PokerRule {

    boolean isTheRuleApplicable(PokerHand pokerHand);
    Score getScore(PokerHand pokerHand);
}
