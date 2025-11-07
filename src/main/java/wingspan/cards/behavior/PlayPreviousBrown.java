package wingspan.cards.behavior;

public class PlayPreviousBrownBehavior implements PowerBehavior {
    private int numPowers;
    private boolean activateAll;

    // Constructor 1: default: activate 1 previous brown power
    public PlayPreviousBrownBehavior(int numPowers) {
        this.numPowers = numPowers;
        this.activateAll = false;   // default: only the nearest previous brown
    }

    // Constructor 2: choose whether to activate ALL previous brown powers
    public PlayPreviousBrownBehavior(int numPowers, boolean activateAll) {
        this.numPowers = numPowers;
        this.activateAll = activateAll;
    }

    @Override
    public boolean executePower() {
        // play previous brown power behavior
        return true;
    }

    public int getNumPowers() {
        return numPowers;
    }

    public boolean activateAll() {
        return activateAll;
    }
}
