import Geometrical.*;
import Geometrical.Shape;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeList extends JPanel {
   private Shape[] shapes;

   public ShapeList(int nbShapes){
      shapes = new Shape[nbShapes];
      Random random = new Random();

      for(int i = 0; i < nbShapes; ++i){
         // Random boolean to create a square or a circle
         Shape newShape;
         if(random.nextBoolean())
            newShape = new FilledSquare(Color.YELLOW);
         else
            newShape = new FilledCircle(Color.BLUE);

         shapes[i] = newShape;
      }
   }

   public void checkShapesMovable(int maxWidth, int maxHeight){
      for(Shape s : shapes){
         double newPosX = s.getPosX() + s.getDirection().getX();
         double newPosY = s.getPosY() + s.getDirection().getY();

         if(newPosX < 0 || newPosX > maxWidth)
            s.invertDirection(true);
         else if (newPosY < 0 || newPosY > maxHeight)
            s.invertDirection(false);
      }
   }

   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      for(Shape s : shapes)
         s.paintComponent(g);
   }
}
