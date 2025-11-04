package wingspan.cards.behavior;

public class GainFoodBehavior implements PowerBehavior {
    private final int numFood;
    private final String typeOfFood;

    public GainFoodBehavior(int numFood, String typeOfFood)
    {
        this.numFood = numFood;
        this.typeOfFood = typeOfFood;
    }

    @Override
    public boolean executePower()
    {
        //gain food behaiovr
        return true;
    }

    public int getNumFood() 
    {
        return numFood;
    }

    public String getTypeOfFood() 
    {
        return typeOfFood;
    }
}
