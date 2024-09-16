package org.example;

import org.example.enums.Suit;
import org.example.enums.Value;
import org.example.rules.*;

import java.util.HashSet;
import java.util.List;

public class Utils {
    public static Player playerWithHandOf(String name, Card... cards){
        return new Player(name,pokerHand(cards));
    }
    private static PokerHand pokerHand(Card... cards){
        return new PokerHand(new HashSet<>(List.of(cards)));
    }

    public static Card cardOf(Suit suit, Value value){
        return new Card(suit,value);
    }

    public static PokerRule[] allPokerRules(){
        PokerRule[] pokerRules = new PokerRule[9];
        pokerRules[0]= new Flush();
        pokerRules[1]= new FourOfKind();
        pokerRules[2]= new FullHouse();
        pokerRules[3]= new HighCard();
        pokerRules[4]= new OnePair();
        pokerRules[5]= new Straight();
        pokerRules[6]= new StraightFlush();
        pokerRules[7]= new ThreeOfKinf();
        pokerRules[8]= new TwoPairs();
        return pokerRules;
    }
}
