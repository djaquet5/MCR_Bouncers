import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import Geometrical.*;
import Geometrical.Shape;

public class Bouncers {

   public static void main(String[] args){
      JFrame bouncers = new JFrame("Bouncers");
      bouncers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      bouncers.setSize(500, 500);
      bouncers.setVisible(true);

      ArrayList<Shape> shapes = new ArrayList<>();
      for(int i = 0; i < 100; ++i){
         // Random boolean to create a square or a circle
         if(getRandomBoolean())
            shapes.add(new Square(Color.YELLOW));
         else
            shapes.add(new Circle(Color.BLUE));
      }
   }

   private static boolean getRandomBoolean(){
      Random random = new Random();
      return random.nextBoolean();
   }
}
