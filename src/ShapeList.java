import Geometrical.*;
import Geometrical.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ShapeList extends JPanel {

   private ArrayList<Shape> shapes = new ArrayList<>();

   public ShapeList(){
      ArrayList<Geometrical.Shape> shapes = new ArrayList<>();

      for(int i = 0; i < 100; ++i){
         // Random boolean to create a square or a circle
         Geometrical.Shape newShape;
         if(getRandomBoolean())
            newShape = new Square(Color.YELLOW);
         else
            newShape = new Circle(Color.BLUE);

         shapes.add(newShape);
      }
   }

   public void drawing() {
      repaint();
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      for(Shape s : shapes){
         g.setColor(s.getColor());

         if(s instanceof Square)
            g.fillRect(s.getPosX(), s.getPosY(), s.getSize(), s.getSize());
         else
            g.fillOval(s.getPosX(), s.getPosY(), s.getSize(), s.getSize());
      }
   }

   public ArrayList<Shape> getShapes(){
      return shapes;
   }

   private static boolean getRandomBoolean(){
      Random random = new Random();
      return random.nextBoolean();
   }
}
