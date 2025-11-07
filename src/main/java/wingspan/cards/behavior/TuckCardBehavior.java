package wingspan.cards.behavior;

public class TuckCardBehavior implements PowerBehavior {
    private int numCards;
    private boolean fromHand;

    // Constructor 1: tuck X cards from hand
    public TuckCardBehavior(int numCards) {
        this.numCards = numCards;
        this.fromHand = true; // default: tuck from hand
    }

    // Constructor 2: specify whether the card comes from hand or deck
    public TuckCardBehavior(int numCards, boolean fromHand) {
        this.numCards = numCards;
        this.fromHand = fromHand;
    }

    @Override
    public boolean executePower() {
        // tuck card behavior
        return true;
    }

    public int getNumCards() {
        return numCards;
    }

    public boolean isFromHand() {
        return fromHand;
    }
}
