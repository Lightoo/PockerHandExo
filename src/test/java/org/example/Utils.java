package org.example;

import org.example.enums.Suit;
import org.example.enums.Value;
import org.example.rules.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        pokerRules[7]= new ThreeOfKind();
        pokerRules[8]= new TwoPairs();
        return pokerRules;
    }
    public static PokerHand pokerHandHighCard() {
        return new PokerHand(Set.of(cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.THREE),
                cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Spades, Value.ACE),
                cardOf(Suit.Hearts, Value.FIVE)));
    }
    public static PokerHand pokerHandOnePair() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.TWO),
                cardOf(Suit.Spades, Value.FIVE),
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Hearts, Value.SEVEN)));
    }
    public static PokerHand pokerHandTwoPairs() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.TWO),
                cardOf(Suit.Spades, Value.FOUR),
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Hearts, Value.KING)));
    }
    public static PokerHand pokerHandThreeOfKind() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.FOUR),
                cardOf(Suit.Spades, Value.FOUR),
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Hearts, Value.KING)));
    }
    public static PokerHand pokerHandStraight() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.TWO),
                cardOf(Suit.Spades, Value.THREE),
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.FIVE),
                cardOf(Suit.Hearts, Value.SIX)));
    }
    public static PokerHand pokerHandFlush() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.TWO),
                cardOf(Suit.Hearts, Value.THREE),
                cardOf(Suit.Hearts, Value.KING),
                cardOf(Suit.Hearts, Value.FIVE),
                cardOf(Suit.Hearts, Value.ACE)));
    }
    public static PokerHand pokerHandFullHouse() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.TWO),
                cardOf(Suit.Spades, Value.TWO),
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.FOUR),
                cardOf(Suit.Hearts, Value.FOUR)));
    }
    public static PokerHand pokerHandFourOfKind() {
        return new PokerHand(Set.of(cardOf(Suit.Hearts, Value.FOUR),
                cardOf(Suit.Spades, Value.FOUR),
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.FOUR),
                cardOf(Suit.Hearts, Value.KING)));
    }
    public static PokerHand pokerHandStraightFlush() {
        return new PokerHand(Set.of(cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Diamonds, Value.THREE),
                cardOf(Suit.Diamonds, Value.FOUR),
                cardOf(Suit.Diamonds, Value.FIVE),
                cardOf(Suit.Diamonds, Value.SIX)));
    }
}
