import Geometrical.*;
import Geometrical.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeList extends JPanel {
   private Shape[] shapes;

   public ShapeList(int nbShapes){
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

   public void checkShapesMovable(int maxWidth, int maxHeight){
      for(Shape s : shapes){
         double newPosX = s.getPosX() + Math.cos(s.getDirection()) / s.getSpeed();
         double newPosY = s.getPosY() + Math.sin(s.getDirection()) / s.getSpeed();

         if(newPosX < 0)
            s.invertDirection(3);
         else if(newPosX > maxWidth)
            s.invertDirection(1);
         else if (newPosY < 0)
            s.invertDirection(2);
         else if (newPosY > maxHeight)
            s.invertDirection(4);
      }
   }

   public void drawing() {
      repaint();
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
