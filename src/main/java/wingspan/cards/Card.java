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

   
}
