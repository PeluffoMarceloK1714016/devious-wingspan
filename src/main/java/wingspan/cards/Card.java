package main.java.wingspan.cards;
import java.awt.iamge.BufferedImage;

public class Card {
    private HashSet<String> habitats;
    private String name;
    private int victoryPoints;
    private int maxEggs;
    private int currentEggs;
    private ArrayList<Card> tuckedCards;
    private ArrayList<String> foodTokens;
    private BufferedImage cardImage;

    public Card(ArrayList<String> habitat, String name, int points, int maxEggs, BufferedImage image)
    {
        this.habitats = new HashSet<String>();
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
        if (habitats.contains(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
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
}
