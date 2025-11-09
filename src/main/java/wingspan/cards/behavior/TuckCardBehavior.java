package wingspan.cards.behavior;

public class TuckCardBehavior implements PowerBehavior {
    private int numCards;
    private boolean fromHand;
    private PowerBehavior secondBehavior;

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

    // Constructor 3: specify whether the card comes from hand or deck + second behavior
    public TuckCardBehavior(int numCards, boolean fromHand, PowerBehavior secondBehavior) {
        this.numCards = numCards;
        this.fromHand = fromHand;
        this.secondBehavior = secondBehavior;
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
