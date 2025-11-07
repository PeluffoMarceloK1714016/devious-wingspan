package wingspan.core;

import wingspan.cards.*;
import java.util.*;
import java.io.*;

public class Player {
	private GameBoard gameBoard;
	private ArrayList<Card> cards;
	private Card cardToPlay;
	private ArrayList<BonusCard> bonusCards;
	private HashMap<String, Integer> foodInventory;
	private int actionsRemaining;
	
	public Player() throws IOException
	{
		gameBoard = new GameBoard();
		cards = new ArrayList<Card>();
		bonusCards = new ArrayList<BonusCard>();
		foodInventory = new HashMap<String, Integer>();
		foodInventory.put("invertebrate", 0);
		foodInventory.put("berry", 0);
		foodInventory.put("wheat", 0);
		foodInventory.put("fish", 0);
		foodInventory.put("rodent", 0);
		resetActionsRemaining(1);
	}
	
	public void addCard(Card c)
	{
		cards.add(c);
	}
	
	public void removeCard(Card c)
	{
		cards.remove(cards.indexOf(c));
	}
	
	public void addBonusCard(BonusCard c)
	{
		bonusCards.add(c);
	}

	public Card getCardToPlay()
	{
		return cardToPlay;
	}

	public void setCardToPlay(Card c)
	{
		cardToPlay = c;
	}
	
	public GameBoard getGameBoard()
	{
		return gameBoard;
	}

	public void addFood(String food, int amount)
	{
		foodInventory.put(food, foodInventory.get(food) + amount);
	}
	
	public void decreaseActionsRemaining()
	{
		actionsRemaining--;
	}
	
	
	public void resetActionsRemaining(int round)
	{
		switch(round)
		{
			case 1:
				actionsRemaining = 8;
				break;
			case 2:
				actionsRemaining = 7;
				break;
			case 3:
				actionsRemaining = 6;
				break;
			case 4:
				actionsRemaining = 5;
				break;
		}
	}
	
	public HashMap<String, Integer> getFood()
	{
		return foodInventory;
	}
}
