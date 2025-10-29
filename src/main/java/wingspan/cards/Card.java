package main.java.wingspan.cards;
import java.awt.image.BufferedImage;
import java.util.*;

public class Card {
    private final HashSet<String> habitats;
    private final String name;
    private int victoryPoints;
    private int maxEggs;
    private int currentEggs;
    private ArrayList<Card> tuckedCards;
    private ArrayList<String> foodTokens;
    private final BufferedImage cardImage;

    public Card(ArrayList<String> habitat, String name, int points, int maxEggs, BufferedImage image)
    {
        this.habitats = new HashSet<>();
        for(String s: habitat)
        {
            this.habitats.add(s);
        }
        this.name = name;
        this.victoryPoints = points;
        this.maxEggs = maxEggs;
        this.currentEggs = 0;
        cardImage = image;
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
