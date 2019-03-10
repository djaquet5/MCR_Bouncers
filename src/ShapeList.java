import Geometrical.*;
import Geometrical.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeList extends JPanel {
   private Shape[] shapes;
   private int nbShapes;

   public ShapeList(int nbShapes){
      this.nbShapes = nbShapes;
   }

   public void drawing() {
      repaint();
   }

   public void init() {
      shapes = new Shape[nbShapes];

      for(int i = 0; i < nbShapes; ++i){
         // Random boolean to create a square or a circle
         Shape newShape;
         if(getRandomBoolean())
            newShape = new Square(Color.YELLOW);
         else
            newShape = new Circle(Color.BLUE);

         shapes[i] = newShape;
      }
   }

   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      for(Shape s : shapes)
         s.paintComponent(g);
   }

   private static boolean getRandomBoolean(){
      Random random = new Random();
      return random.nextBoolean();
   }
}
