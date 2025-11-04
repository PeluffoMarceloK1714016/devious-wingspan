package wingspan.cards.behavior;

public class DrawCardBehavior implements PowerBehavior {
    private final int numCards;
    private final int cardsToTuck;

    public DrawCardBehavior(int numCards, int cardsToTuck)
    {
        this.numCards = numCards;
        this.cardsToTuck = cardsToTuck;
    }

    @Override
    public boolean executePower()
    {
        // logic to draw card and optionally tuck
    }

}