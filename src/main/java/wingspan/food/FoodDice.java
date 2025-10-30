package main.java.wingspan.food;

import java.awt.image.BufferedImage;
import java.util.*;

public class FoodDice {
        private BufferedImage diceFace;
        private String currentFood;

        private ArrayList<String> foodChoices;
        private ArrayList<BufferedImage> foodFaces;

        public FoodDice(){
            foodChoices = new ArrayList<>();
            foodChoices.add("invertebrate");
            foodChoices.add("wheat");
            foodChoices.add("rodent");
            foodChoices.add("berry");
            foodChoices.add("fish");

            foodFaces = new ArrayList<>();
            foodFaces.add(" file name ");  // corresponds to the indexes of the foodChoices
            foodFaces.add(" file name ");
            foodFaces.add(" file name ");
            foodFaces.add(" file name ");
            foodFaces.add(" file name ");

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
