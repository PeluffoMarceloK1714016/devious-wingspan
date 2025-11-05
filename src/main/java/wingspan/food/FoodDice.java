package wingspan.food;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;

public class FoodDice {
        private BufferedImage diceFace;
        private String currentFood;

        private ArrayList<String> foodChoices;
        private ArrayList<BufferedImage> foodFaces;

        public FoodDice() throws IOException{
            foodChoices = new ArrayList<>();
            foodChoices.add("choice");
            foodChoices.add("invertebrate");
            foodChoices.add("wheat");
            foodChoices.add("rodent");
            foodChoices.add("berry");
            foodChoices.add("fish");
            
            BufferedImage choiceImage = ImageIO.read(FoodDice.class.getResource("/Image/MultiDice.jpg"));
            BufferedImage invertebrateImage = ImageIO.read(FoodDice.class.getResource("/Image/InvertebrateDice.jpg"));
            BufferedImage wheatImage = ImageIO.read(FoodDice.class.getResource("/Image/WheatDice.jpg"));
            BufferedImage rodentImage = ImageIO.read(FoodDice.class.getResource("/Image/RodentDice.jpg"));
            BufferedImage berryImage = ImageIO.read(FoodDice.class.getResource("/Image/BerryDice.jpg"));
            BufferedImage fishImage = ImageIO.read(FoodDice.class.getResource("/Image/FishDice.jpg"));

            foodFaces = new ArrayList<>();
            foodFaces.add(choiceImage);
            foodFaces.add(invertebrateImage);
            foodFaces.add(wheatImage);
            foodFaces.add(rodentImage);
            foodFaces.add(berryImage);
            foodFaces.add(fishImage);

            rerollDice();
            }

        public void rerollDice(){
            Random random = new Random();
            int randomNumber = random.nextInt(6);
            currentFood = foodChoices.get(randomNumber);
            diceFace =  foodFaces.get(randomNumber);
        }

        public BufferedImage getImage(){
            return diceFace;
        }

        public String getFood(){
            return currentFood;
        }
}
