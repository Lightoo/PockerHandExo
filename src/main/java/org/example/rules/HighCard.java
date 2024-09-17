package org.example.rules;

import org.example.Card;
import org.example.PokerHand;
import org.example.Score;

public class HighCard implements PokerRule{
    @Override
    public boolean isTheRuleApplicable(PokerHand pokerHand) {
        return true;
    }

    @Override
    public Score getScore(PokerHand pokerHand) {
        Card card =pokerHand.getStrongestCard();
        return new Score(getPriority(), card,"high card: "+card.getValue());
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
