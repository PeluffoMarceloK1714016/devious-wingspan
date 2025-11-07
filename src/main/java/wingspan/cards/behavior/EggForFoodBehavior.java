package wingspan.cards.behavior;

public class EggForFoodBehavior implements PowerBehavior {
    private int numEggs;
    private int numFood;
    private boolean onThisBird;
    private String typeOFFood;

    // Constructor 1
    public EggForFoodBehavior(int numEggs, int numFood, boolean onThisBird, String typeOFFood) {
        this.numEggs = numEggs;
        this.numFood = numFood;
        this.onThisBird = onThisBird;
        this.typeOFFood = typeOFFood;
    }

    // Constructor 2 (no food type given)
    public EggForFoodBehavior(int numEggs, int numFood, boolean onThisBird) {
        this.numEggs = numEggs;
        this.numFood = numFood;
        this.onThisBird = onThisBird;
        this.typeOFFood = "any";
    }

    @Override
    public boolean executePower() {
        // egg for food behavior
        return true;
    }

    public int getNumEggs() {
        return numEggs;
    }

    public int getNumFood() {
        return numFood;
    }

    public boolean getOnThisBird() {
        return onThisBird;
    }

    public String getTypeOFFood() {
        return typeOFFood;
    }
}
