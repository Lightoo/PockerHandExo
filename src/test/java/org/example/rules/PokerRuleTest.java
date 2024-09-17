package org.example.rules;

import org.junit.jupiter.api.Test;

import static org.example.Utils.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokerRuleTest {
    private PokerRule pokerRule;
    @Test
    void highCard_rule_is_applicable(){
        pokerRule = new HighCard();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandHighCard()));
    }
    @Test
    void onePair_rule_is_applicable(){
        pokerRule = new OnePair();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandOnePair()));
    }
    @Test
    void twoPairs_rule_is_applicable(){
        pokerRule = new TwoPairs();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandTwoPairs()));
    }
    @Test
    void threeOfKind_rule_is_applicable(){
        pokerRule = new ThreeOfKind();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandThreeOfKind()));
    }
    @Test
    void straight_rule_is_applicable(){
        pokerRule = new ThreeOfKind();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandStraight()));
    }
    @Test
    void flush_rule_is_applicable(){
        pokerRule = new Flush();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandFlush()));
    }
    @Test
    void fullHouse_rule_is_applicable(){
        pokerRule = new FullHouse();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandFullHouse()));
    }
    @Test
    void fourOfKind_rule_is_applicable(){
        pokerRule = new FourOfKind();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandFourOfKind()));
    }
    @Test
    void straightFlush_rule_is_applicable(){
        pokerRule = new StraightFlush();
        assertTrue(pokerRule.isTheRuleApplicable(pokerHandStraightFlush()));
    }
}
