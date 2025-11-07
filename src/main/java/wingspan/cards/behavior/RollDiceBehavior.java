package wingspan.cards.behavior;

public class RollDiceBehavior implements PowerBehavior {
    private int numDice;
    private boolean onlyOutsideFeeder;

    // Constructor 1: roll a specific number of dice
    public RollDiceBehavior(int numDice) {
        this.numDice = numDice;
        this.onlyOutsideFeeder = false; // default: roll dice inside feeder
    }

    // Constructor 2: roll dice with option for "outside feeder" behavior
    public RollDiceBehavior(int numDice, boolean onlyOutsideFeeder) {
        this.numDice = numDice;
        this.onlyOutsideFeeder = onlyOutsideFeeder;
    }

    @Override
    public boolean executePower() {
        // roll dice behavior
        return true;
    }

    public int getNumDice() {
        return numDice;
    }

    public boolean isOnlyOutsideFeeder() {
        return onlyOutsideFeeder;
    }
}
