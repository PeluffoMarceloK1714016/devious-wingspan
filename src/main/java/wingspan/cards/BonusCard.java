package main.java.wingspan.cards;
import java.awt.image.BufferedImage;

public class BonusCard {
	private BufferedImage cardImage;
	private int victoryPoints;
	
	public BonusCard(BufferedImage image, int points)
	{
		cardImage = image;
		victoryPoints = points;
	}
	
	public BufferedImage getImage()
	{
		return cardImage;
	}
	
	public int calculateScore(Player p)
	{
		//placeholder; will be overridden in child BonusCard classes
		return 0;
	}
}

