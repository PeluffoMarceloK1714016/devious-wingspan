package main.java.wingspan.cards;

public class PlayPreviousBrown implements PowerBehavior {
    boolean playedBrownBefore = true; // sample

    public boolean executePower() {
        if (playedBrownBefore) {
            // play previous brown
        }

        return true;
    }

}