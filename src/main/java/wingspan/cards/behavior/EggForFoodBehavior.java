package wingspan.cards.behavior;

public class EggForFoodBehavior {
    
}
package wingspan.cards.behavior;

public class EggForFoodBehavior implements PowerBehavior {
    private int numEggs;
    private int numFood;
    private String typeOFFood;

    // Constructor 1
    public EggForFoodBehavior(int numEggs, int numFood, String typeOFFood) {
        this.numEggs = numEggs;
        this.numFood = numFood;
        this.typeOFFood = typeOFFood;
    }

    // Constructor 2 (no food type given)
    public EggForFoodBehavior(int numEggs, int numFood) {
        this.numEggs = numEggs;
        this.numFood = numFood;
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

    public String getTypeOFFood() {
        return typeOFFood;
    }
}
