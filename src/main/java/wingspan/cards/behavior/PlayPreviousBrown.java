package wingspan.cards.behavior;

public class PlayPreviousBrown implements PowerBehavior {
    boolean playedBrownBefore = true; // sample

    @Override
    public boolean executePower() {
        if (playedBrownBefore) {
            // play previous brown
        }

        return true;
    }

}
