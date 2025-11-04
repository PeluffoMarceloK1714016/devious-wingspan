package wingspan.core;
import java.util.*;

public class GoalBoard {
	private ArrayList<Goal> goals;
	private Goal round1Goal;
	private Goal round2Goal;
	private Goal round3Goal;
	private Goal round4Goal;
	
	public GoalBoard()
	{
		goals = new ArrayList<Goal>();
		addGoals();
		round1Goal = goals.remove((int)(Math.random() * goals.size()));
		round2Goal = goals.remove((int)(Math.random() * goals.size()));
		round3Goal = goals.remove((int)(Math.random() * goals.size()));
		round4Goal = goals.remove((int)(Math.random() * goals.size()));
	}
	
	public void addGoals()
	{
		// this method will add all unique goal classes to the goals ArrayList once they're implemented
	}
}
