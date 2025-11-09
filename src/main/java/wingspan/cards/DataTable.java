package wingspan.cards;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.*;
import javax.imageio.ImageIO;
import com.fasterxml.jackson.databind.ObjectMapper;
import wingspan.WingspanFrame;
import wingspan.cards.behavior.*;
import wingspan.enums.*;

interface BehaviorCreator {
    PowerBehavior create(Object... params);
}

class BirdInfoJson {
    public String name;
    public List<String> habitats;
    public List<List<String>> food;
    public int victoryPoints;
    public String nestType;
    public int maxEggs;
    public int wingSpan;
    public String color;
    public Map<String,Object> behaviorObject; // added for BehaviorFactory
    public String image;
}

class BehaviorFactory {
    private static final Map<String, BehaviorCreator> registry = new HashMap<>();

    static {
        registry.put("tuckCard1", params -> new TuckCardBehavior((Integer) params[0]));
        registry.put("tuckCard2", params -> new TuckCardBehavior((Integer) params[0], (Boolean) params[1]));
        registry.put("tuckCard3", params -> new TuckCardBehavior(
                (Integer) params[0],
                (Boolean) params[1],
                (PowerBehavior) params[2]
        ));
    }

    public static PowerBehavior getBehavior(Object json) {
        if (json instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, Object> obj = (Map<String, Object>) json;
            String name = (String) obj.get("behavior");
            List<Object> paramList = (List<Object>) obj.get("behaviorParams");

            Object[] params = new Object[paramList.size()];
            for (int i = 0; i < paramList.size(); i++) {
                Object p = paramList.get(i);
                if (p instanceof Map) {
                    params[i] = getBehavior(p);
                } else {
                    params[i] = p;
                }
            }

            BehaviorCreator creator = registry.get(name);
            if (creator == null) throw new IllegalArgumentException("Unknown behavior: " + name);
            return creator.create(params);
        } else {
            throw new IllegalArgumentException("Behavior JSON must be an object");
        }
    }
}

public class DataTable {

    private static Food[][] getFoodArray(BirdInfoJson bj) {
        Food[][] foodArray = new Food[bj.food.size()][];
        for (int r = 0; r < bj.food.size(); r++) {
            List<String> row = bj.food.get(r);
            foodArray[r] = new Food[row.size()];
            for (int c = 0; c < row.size(); c++) {
                foodArray[r][c] = Food.valueOf(row.get(c).toUpperCase());
            }
        }
        return foodArray;
    }

    private static EnumSet<Habitat> getHabitatSet(BirdInfoJson bj) {
        EnumSet<Habitat> habitats = EnumSet.noneOf(Habitat.class);
        for (String h : bj.habitats) habitats.add(Habitat.valueOf(h.toUpperCase()));
        return habitats; // fixed: return statement
    }

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            BirdInfoJson[] birds = mapper.readValue(new File("wingspan/cards/birds.json"), BirdInfoJson[].class);

            for (BirdInfoJson bj : birds) {
                EnumSet<Habitat> habitats = getHabitatSet(bj);
                Food[][] foodArray = getFoodArray(bj);
                NestType nestType = NestType.valueOf(bj.nestType.toUpperCase());
                Color color = Color.valueOf(bj.color.toUpperCase());

                String imagePath = "/Images/" + bj.image;
                InputStream imgStream = WingspanFrame.class.getResourceAsStream(imagePath);
                BufferedImage birdImage = ImageIO.read(imgStream);

                PowerBehavior behavior = BehaviorFactory.getBehavior(bj.behaviorObject);

                BirdInfo birdInfo = new BirdInfo(
                        bj.name, habitats, foodArray, bj.victoryPoints,
                        nestType, bj.maxEggs, bj.wingSpan, color,
                        behavior
                );

                CardManager.birdCards.add(new Card(birdInfo, birdImage));
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load birds JSON", e);
        }
    }
}
