package wingspan.cards.behavior;

public class GainFoodBehavior implements PowerBehavior {
    private int numFood;
    private String typeOfFood;
    private boolean isCacheable;
    private boolean isFromFeeder;


    public GainFoodBehavior(int numFood, String typeOfFood)
    {
        this.numFood = numFood;
        this.typeOfFood = typeOfFood;
    }

    public GainFoodBehavior(int numFood, String typeOfFood, boolean isCacheable) 
    {
        this.numFood = numFood;
        this.typeOfFood = typeOfFood;
        this.isCacheable = isCacheable;
    }

    public GainFoodBehavior(int numFood, String typeOfFood, boolean isCacheable, boolean isFromFeeder) 
    {   
        this.numFood = numFood;
        this.typeOfFood = typeOfFood;
        this.isCacheable = isCacheable;
        this.isFromFeeder = isFromFeeder;
    }

    @Override
    public boolean executePower()
    {
        
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

    public boolean isCacheable() {
        return isCacheable;
    }

    public boolean isFromFeeder() {
        return isFromFeeder;
    }
}
