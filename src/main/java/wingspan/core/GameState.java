package wingspan.core;
import java.util.*;

import wingspan.food.FoodManager;
import wingspan.cards.CardManager;

public class GameState {
	//these are initialized in WingspanRunner's main method
	private FoodManager foodManager;
	private CardManager cardManager;
	private ArrayList<Player> players;
	private Player activePlayer;
	private GoalBoard goalBoard;

	public FoodManager getFoodManager()
	{
		return foodManager;
	}

	public void setFoodManager(FoodManager foodManager)
	{
		this.foodManager = foodManager;
	}

	public CardManager getCardManager()
	{
		return cardManager;
	}

	public void setCardManager(CardManager cardManager)
	{
		this.cardManager = cardManager;
	}

	public ArrayList<Player> getPlayers()
	{
		return players;
	}

	public void setPlayers(ArrayList<Player> players)
	{
		this.players = players;
	}

	public Player getActivePlayer()
	{
		return activePlayer;
	}

	public void setActivePlayer(Player activePlayer)
	{
		this.activePlayer = activePlayer;
	}

	public GoalBoard getGoalBoard()
	{
		return goalBoard;
	}

	public void setGoalBoard(GoalBoard goalBoard)
	{
		this.goalBoard = goalBoard;
	}

	

}
