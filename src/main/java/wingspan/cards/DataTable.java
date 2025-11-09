package wingspan.cards;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.*;

import javax.imageio.ImageIO;

import com.fasterxml.jackson.databind.ObjectMapper;

import wingspan.WingspanFrame;
import wingspan.enums.Habitat;

public class DataTable {

    private ObjectMapper mapper;
    private BirdInfoJson[] birds;

    public DataTable()
    {
        mapper = new ObjectMapper();
        birds = mapper.readValue(new File("wingspan/cards/birds.json"),  BirdInfoJson[].class);
    }

    for (BirdInfoJson bj : birds) {
        EnumSet<Habitat> habitats = EnumSet.noneOf(Habitat.class);
        for (String h : bj.habitats) habitats.add(Habitat.valueOf(h.toUpperCase()));
        // Convert food, nest type, color, behavior similarly
        
        String imagePath = "/Images/" + bj.image;
        InputStream imgStream = WingspanFrame.class.getResourceAsStream(imagePath);
        BufferedImage birdImage = ImageIO.read(imgStream);

        BirdInfo birdInfo = new BirdInfo(
            bj.name, habitats, foodArray, bj.points,
            nestType, bj.maxEggs, bj.wingSpan, color,
            behavior, birdImage
        );

        CardManager.birdCards.add(new Card(birdInfo, birdImage));
    }


}

class BirdInfoJson {
    public String name;
    public List<String> habitats;
    public List<List<String>> foodCost;
    public int victoryPoints;
    public String nestType;
    public int maxEggs;
    public int wingSpan;
    public String powerColor;
    public String behavior;
    public String image;
}