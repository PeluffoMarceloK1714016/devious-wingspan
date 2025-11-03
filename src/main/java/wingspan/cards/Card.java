package main.java.wingspan.cards;
import java.awt.image.BufferedImage;
import java.util.*;

public class Card {
    private final BirdInfo birdInfo;
    private final BufferedImage cardImage;

    public Card(BirdInfo birdInfo, BufferedImage cardImage)
    {
        this.birdInfo = birdInfo;
        this.cardImage = cardImage;
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
