package wingspan.cards.behavior;

public class EggForFoodBehavior implements PowerBehavior {
    private int numEggs;
    private int numFood;
    private boolean onThisBird;
    private String typeOfFood;

    // Constructor 1
    public EggForFoodBehavior(int numEggs, int numFood, boolean onThisBird, String typeOfFood) {
        this.numEggs = numEggs;
        this.numFood = numFood;
        this.onThisBird = onThisBird;
        this.typeOfFood = typeOfFood;
    }

    // Constructor 2 (no food type given)
    public EggForFoodBehavior(int numEggs, int numFood, boolean onThisBird) {
        this.numEggs = numEggs;
        this.numFood = numFood;
        this.onThisBird = onThisBird;
        this.typeOfFood = "any";
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

    public String getTypeOfFood() {
        return typeOfFood;
    }
}
