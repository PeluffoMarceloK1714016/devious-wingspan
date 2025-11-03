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

     public boolean addEggs(int amount)
    {
        if (currentEggs + amount <= maxEggs)
        {
            currentEggs += amount;
            return true;
        }
        else
        {
            return false;
        }
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

    public BufferedImage getImage()
    {
        return cardImage;
    }

    public void addTuckedCard(Card c)
    {
        tuckedCards.add(c);
    }

    public void addFoodtoken(String s)
    {
        foodTokens.add(s);
    }

    public int getVictoryPoints() 
    {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) 
    {
        this.victoryPoints = victoryPoints;
    }

    public void setMaxEggs(int maxEggs) 
    {
        this.maxEggs = maxEggs;
    }

    public ArrayList<Card> getTuckedCards() 
    {
        return tuckedCards;
    }

    public ArrayList<String> getFoodTokens() 
    {
        return foodTokens;
    }
}