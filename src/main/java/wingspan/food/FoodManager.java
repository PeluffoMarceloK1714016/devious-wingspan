package wingspan.food;
import java.util.*;
import java.io.*;

public class FoodManager {
	private ArrayList<FoodDice> birdFeeder;
	
	public FoodManager() throws IOException
	{
		birdFeeder = new ArrayList<FoodDice>();
		reroll();
	}
	
	public void reroll() throws IOException
	{
		birdFeeder.clear();
		for(int i=0; i<5; i++)
		{
			birdFeeder.add(new FoodDice());
		}
	}
	
	public FoodDice getDie(int index)
	{
		return birdFeeder.get(index);
	}
}
