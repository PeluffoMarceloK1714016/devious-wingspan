package main.java.wingspan.cards.goals;
import java.awt.image.BufferedImage;

public class Goal {

    private BufferedImage goalImage; // what the player will be shown
    private String goalString; // used to identify what the goal actually is

    public Goal(BufferedImage goalImage, String goalString) 
    {
        this.goalImage = goalImage;
        this.goalString = goalString;
        System.out.println("The Goal " + goalString + " was created.");
    }

    public int evaluateGoal(Player p)
    {
        /*
         *  
         * 
         * if goal met:
         *      player points + amount
         *  else:
         *      no points added (or points deducted depending on whether that is a rule)
         * 
         * 
         */

        return 0; // arbitrary return value for now
    }

    public BufferedImage getImage()
    {
        return this.goalImage;
    }

    public String getGoalString()
    {
        return this.goalString;
    }

}
