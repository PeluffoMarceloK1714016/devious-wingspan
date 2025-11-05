package wingspan.ui;

public class SetupGame {
    boolean isSetup = true;
    
    int currentPlayer = 1;
    boolean playerIsSet = false; //This boolean will signal whether or not the current player is has completed the set up stage.
        //Once the current player completes the set up stage, it will switch to true, display the set up stage for the next player, and then change to false.
}
