package wingspan.core;

enum Input {

	CIRCLE_1,
	CIRCLE_2,
	CIRCLE_3,
	CIRCLE_4,
	CIRCLE_5,
	CARD_1,
	CARD_2,
	CARD_3,
	CARD_4,
	CARD_5,

}


public class GameState {
	


	
	public void addPlayerSelection(Input in)
	{
		switch (in)
		{
			case CIRCLE_1 -> System.out.println("Circle 1 Selected.");
			default:
				System.out.println("Nevermind.");
				//this is the idea
		}
	}

}
