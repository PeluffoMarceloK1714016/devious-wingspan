package wingspan.core;
import java.util.*;

import wingspan.food.FoodManager;
import wingspan.cards.CardManager;

public class GameState {
	//these are initialized in WingspanRunner's main method
	public static FoodManager foodManager;
	public static CardManager cardManager;
	public static ArrayList<Player> players;
	public static GoalBoard goalBoard;
}
