package org.example;

public class Score implements Comparable<Score>{
    private final int priority;
    private final Card strongestCard;
    private String outputDisplay;

    public Score(int priority, Card strongestCard,String outputDisplay) {
        this.priority = priority;
        this.strongestCard = strongestCard;
        this.outputDisplay = outputDisplay;
    }

    public String getOutputDisplay() {
        return outputDisplay;
    }

    public void setOutputDisplay(String outputDisplay) {
        this.outputDisplay = outputDisplay;
    }

    @Override
    public int compareTo(Score o) {
        if(priority==o.priority) return Integer.compare(strongestCard.getValue().getPriority(),o.strongestCard.getValue().getPriority());
        return Integer.compare(priority, o.priority);
    }

    @Override
    public String toString() {
        return outputDisplay;
    }

}
