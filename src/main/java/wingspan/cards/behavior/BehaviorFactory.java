package wingspan.cards.behavior;

public class BehaviorFactory {
    public static PowerBehavior createBehavior(BehaviorParameters params) {
        switch (params.type.toUpperCase()) {
            case "TUCK_CARD":
                return new TuckCardBehavior(params);
            case "DRAW_CARD":
                return new DrawCardBehavior(params);
            case "GAIN_FOOD":
                return new GainFoodBehavior(params);

            // add all other behavior types here
            default:
                throw new IllegalArgumentException("Unknown behavior type: " + params.type);
        }
    }
}
