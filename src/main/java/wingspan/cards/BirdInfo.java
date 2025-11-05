package wingspan.cards;

import wingspan.cards.behavior.*;
import java.util.*;

public class BirdInfo {
    private final String name;
    private final HashSet<String> habitats;
    private final int victoryPoints;
    private final String[] foodCost;
    private final String nestType;
    private final int maxEggs;
    private final int wingspan;
    private final String powerColor;
    private final PowerBehavior behavior;

    public BirdInfo(String name, HashSet<String> habitats, int victoryPoints, String[] foodCost, String nestType, int maxEggs, int wingspan, String powerColor, PowerBehavior behavior)
    {
        this.name = name;
        this.habitats = habitats;
        this.victoryPoints = victoryPoints;
        this.foodCost = foodCost;
        this.nestType = nestType;
        this.maxEggs = maxEggs;
        this.wingspan = wingspan;
        this.powerColor = powerColor;
        this.behavior = behavior;
    }



    public boolean hasHabitat(String s)
    {
        return habitats.contains(s);
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return victoryPoints;
    }

    public int getVictoryPoints() 
    {
        return victoryPoints;
    }

    public String[] getFoodCost() 
    {
        return foodCost;
    }

    public String getNestType() 
    {
        return nestType;
    }

    public int getMaxEggs() 
    {
        return maxEggs;
    }

    public int getWingspan() 
    {
        return wingspan;
    }

    public String getPowerColor()
    {
        return powerColor;
    }

    public PowerBehavior getBehavior() 
    {
        return behavior;
    }
}