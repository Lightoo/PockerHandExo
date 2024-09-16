package org.example;

public class Score implements Comparable<Score>{
    private final int priority;
    private final Card strongestCard;

    public Score(int priority, Card strongestCard) {
        this.priority = priority;
        this.strongestCard = strongestCard;
    }

    @Override
    public int compareTo(Score o) {
        return 0;
    }

}
