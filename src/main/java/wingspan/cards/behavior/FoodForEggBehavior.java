package wingspan.cards.behavior;

public class FoodForEggBehavior implements PowerBehavior {
    private int numFood;
    private String typeOFFood;
    private int numEggs;

    // Constructor 1
    public FoodForEggBehavior(int numFood, String typeOFFood, int numEggs) {
        this.numFood = numFood;
        this.typeOFFood = typeOFFood;
        this.numEggs = numEggs;
    }

    // Constructor 2 (no food type given)
    public FoodForEggBehavior(int numFood, int numEggs) {
        this.numFood = numFood;
        this.typeOFFood = "any";
        this.numEggs = numEggs;
    }

    @Override
    public boolean executePower() {
        // food for egg behavior
        return true;
    }

    public int getNumFood() {
        return numFood;
    }

    public String getTypeOFFood() {
        return typeOFFood;
    }

    public int getNumEggs() {
        return numEggs;
    }
}
