package org.example.rules;

import org.example.PokerHand;
import org.example.Score;

public class Straight implements PokerRule{
    @Override
    public boolean isTheRuleApplicable(PokerHand pokerHand) {
        return false;
    }

    @Override
    public Score getScore(PokerHand pokerHand) {
        return null;
    }

    @Override
    public int getPriority() {
        return 5;
    }
}
