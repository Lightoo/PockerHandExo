package org.example.rules;

import org.example.PockerHand;
import org.example.Score;

public interface PockerRule {

    boolean isTheRuleApplicable(PockerHand pockerHand);
    Score getScore(PockerHand pockerHand);
}
