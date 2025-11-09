package wingspan.cards;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.*;
import javax.imageio.ImageIO;
import com.fasterxml.jackson.databind.ObjectMapper;
import wingspan.WingspanFrame;
import wingspan.enums.*;

class BirdInfoJson {
    public String name;
    public List<String> habitats;
    public List<List<String>> food;
    public int victoryPoints;
    public String nestType;
    public int maxEggs;
    public int wingSpan;
    public String color;
    public String behavior;
    public String image;
}

public class DataTable {
    private static Food[][] getFoodArray(BirdInfoJson bj)
    {
        Food[][] foodArray = new Food[bj.food.size()][];

        for (int r = 0; r < bj.food.size(); r++)
        {   
            List<String> row = bj.food.get(r);
            foodArray[r] = new Food[row.size()];

            for (int c = 0; c < bj.food.get(r).size(); c++)
            {
                Food f = Food.valueOf(bj.food.get(r).get(c).toUpperCase());
                foodArray[r][c] = f;
            }

        }

        return foodArray;
    }

    private static EnumSet<Habitat> getHabitatSet(BirdInfoJson bj)
    {
        EnumSet<Habitat> habitats = EnumSet.noneOf(Habitat.class);
        for (String h : bj.habitats) habitats.add(Habitat.valueOf(h.toUpperCase()));       
    }


    static
    {
        ObjectMapper mapper = new ObjectMapper();
        BirdInfoJson[] birds = mapper.readValue(new File("wingspan/cards/birds.json"),  BirdInfoJson[].class);
        
        for (BirdInfoJson bj : birds) 
        {

            EnumSet<Habitat> habitats = getHabitatSet(bj);
            Food[][] foodArray = getFoodArray(bj);
            NestType nestType = NestType.valueOf(bj.nestType);
            Color color = Color.valueOf(bj.color);
            
            String imagePath = "/Images/" + bj.image;
            InputStream imgStream = WingspanFrame.class.getResourceAsStream(imagePath);
            BufferedImage birdImage = ImageIO.read(imgStream);

            BirdInfo birdInfo = new BirdInfo(
                bj.name, habitats, foodArray, bj.victoryPoints,
                nestType, bj.maxEggs, bj.wingSpan, color,
                behavior, birdImage // behavior factory
            );

            CardManager.birdCards.add(new Card(birdInfo, birdImage));
        }
    }


}

