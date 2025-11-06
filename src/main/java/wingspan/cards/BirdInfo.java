package wingspan.cards;
import wingspan.cards.behavior.*;

import java.util.*;

public class BirdInfo {
    private final String name; // Bird name
    private final HashSet<String> habitats; // Habitats: forest, grassland, wetland
    private final String[][] foodCost; // Food cost: fish, invertebrate, grain, fruit, rodent, wild
    private final int victoryPoints; // Victory points
    private final String nestType; // Nest type: bowl, cavity, platform, ground, star, none
    private final int maxEggs; // Maximum number of eggs
    private final int wingSpan; // Wingspan in cm
    private final String powerColor; // Power color: brown, pink, white, none
    private final PowerBehavior behavior;

    public BirdInfo(String name, HashSet<String> habitats, String[][] foodCost, int victoryPoints,
                    String nestType, int maxEggs, int wingSpan, String powerColor, PowerBehavior behavior) {
        this.name = name;
        this.habitats = habitats;
        this.foodCost = foodCost;
        this.victoryPoints = victoryPoints;
        this.nestType = nestType;
        this.maxEggs = maxEggs;
        this.wingSpan = wingSpan;
        this.powerColor = powerColor;
        this.behavior = behavior;
    }

    public String getName() { return name; }
    public HashSet<String> getHabitats() { return habitats; }
    public String[][] getFoodCost() { return foodCost; }
    public int getVictoryPoints() { return victoryPoints; }
    public String getNestType() { return nestType; }
    public int getMaxEggs() { return maxEggs; }
    public int getWingSpan() { return wingSpan; }
    public String getPowerColor() { return powerColor; }
    public PowerBehavior getBehavior() { return behavior; }
}
