package Factory;

import Geometrical.*;

import java.awt.*;

public class FilledShapeFactory extends ShapeFactory {

   public Bouncable createCircle() {
      return new FilledCircle(Color.BLUE);
   }

   public Bouncable createSquare() {
      return new FilledSquare(Color.YELLOW);
   }
}