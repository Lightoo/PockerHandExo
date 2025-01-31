package org.example;

import org.example.enums.Suit;
import org.example.enums.Value;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Utils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerGameTest {
    final String PLAYER1="player1";
    final String PLAYER2="player2";

    PokerGame pokerGame;
    @BeforeEach
    void setUp(){
        pokerGame = new PokerGame(allPokerRules());
    }
    @Test
    void win_the_game_with_HighCard_rule(){
        Player player1 = new Player(PLAYER1, pokerHandHighCard());
        Player player2 = playerWithHandOf(PLAYER2,
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.THREE),
                cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Spades, Value.NINE),
                cardOf(Suit.Hearts, Value.FIVE)
        );
        assertEquals("player1 wins. - with high card: ACE", pokerGame.play(player1,player2));
    }
    @Test
    void win_the_game_with_FullHouse_rule(){
        Player player1 = new Player(PLAYER1, pokerHandFullHouse());
        Player player2 = playerWithHandOf(PLAYER2,
                cardOf(Suit.Spades, Value.TWO),
                cardOf(Suit.Spades, Value.EIGHT),
                cardOf(Suit.Spades, Value.ACE),
                cardOf(Suit.Spades, Value.QUEEN),
                cardOf(Suit.Hearts, Value.THREE)
        );
        assertEquals("player1 wins. - with full house: 4 over 2", pokerGame.play(player1,player2));
    }
    @Test
    void win_the_game_with_Pair_rule(){
        Player player1 = new Player(PLAYER1, pokerHandOnePair());
        Player player2 = playerWithHandOf(PLAYER2,
                cardOf(Suit.Spades, Value.TWO),
                cardOf(Suit.Spades, Value.THREE),
                cardOf(Suit.Spades, Value.FOUR),
                cardOf(Suit.Spades, Value.EIGHT),
                cardOf(Suit.Hearts, Value.KING)
        );
        assertEquals("player1 wins. - with pair: 2", pokerGame.play(player1,player2));
    }

    //TODO all other case, at least one case by pokerRule
}
