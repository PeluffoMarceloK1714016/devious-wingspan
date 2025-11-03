package main.java.wingspan.cards;
import java.awt.image.BufferedImage;
import java.util.*;

public class Card {
    private BirdInfo birdInfo;
    private BufferedImage cardImage;

    public Card(BirdInfo birdInfo, BufferedImage cardImage)
    {
        this.birdInfo = birdInfo;
        this.cardImage = cardImage;
    }

    public BirdInfo getBirdInfo() { return birdInfo; }
    public BufferedImage getCardImage() { return cardImage; }

    public void setBirdInfo(BirdInfo newBirdInfo)
    {
        birdInfo = newBirdInfo;
    }

    public void setCardImage(BufferedImage newCardImage)
    {
        cardImage = newCardImage; // if we want to use templates instead of 170 separate card objs
    }
}
