package main.java.wingspan.cards;

public class BirdInfo {
    private final String name;
    private final HashSet<String> habitats;
    private int victoryPoints;
    private int maxEggs;
    private int currentEggs;
    private ArrayList<Card> tuckedCards;
    private ArrayList<String> foodTokens;
    
    //IMPORTANT
    private PowerBehavior behavior;

    public BirdInfo(String name, HashSet<String> habitats /* etc... */)
    {
        this.name = name;
        this.habitats = habitats;
        // etc...
        // behavior = new (Type)Behavior; which is determined when hard coding bird info
    }
}