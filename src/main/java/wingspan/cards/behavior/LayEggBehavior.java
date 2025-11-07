package wingspan.cards.behavior;

public class LayEggBehavior implements PowerBehavior {
    private int numEggs;
    private boolean onThisBird;
    private String nestType;

    // Constructor 1: only number of eggs
    public LayEggBehavior(int numEggs) {
        this.numEggs = numEggs;
        this.onThisBird = true;  // default: lay eggs on the same bird
    }

    // Constructor 2: number of eggs + whether it must be on this bird
    public LayEggBehavior(int numEggs, boolean onThisBird) {
        this.numEggs = numEggs;
        this.onThisBird = onThisBird;
    }

    // Constructor 3: number of eggs + whether it must be on this bird + nest type
    public LayEggBehavior(int numEggs, boolean onThisBird, String nestType) {
        this.numEggs = numEggs;
        this.onThisBird = onThisBird;
        this.nestType = nestType;
    }

    @Override
    public boolean executePower() {
        // lay egg behavior
        return true;
    }

    public int getNumEggs() {
        return numEggs;
    }

    public boolean isOnThisBird() {
        return onThisBird;
    }

    public String getNestType() {
        return nestType;
    }
}
