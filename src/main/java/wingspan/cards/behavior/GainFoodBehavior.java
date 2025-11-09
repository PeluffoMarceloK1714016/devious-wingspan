package wingspan.cards.behavior;

import wingspan.enums.*;

public class GainFoodBehavior implements PowerBehavior {
    private int numFood;
    private Food typeOfFood;
    private boolean isCacheable;
    private boolean isFromFeeder;


    public GainFoodBehavior(BehaviorParameters params)
    {
        this.numFood = params.numFood;
        this.typeOfFood = params.typeOfFood;
        this.isCacheable = params.isCacheable;
        this.isFromFeeder = params.isFromFeeder;
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

    public Food getTypeOfFood() 
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
