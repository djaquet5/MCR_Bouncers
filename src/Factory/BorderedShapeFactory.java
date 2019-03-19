package Factory;

import Geometrical.BorderedCircle;
import Geometrical.BorderedSquare;
import Geometrical.Bouncable;

import java.awt.*;

public class BorderedShapeFactory extends ShapeFactory {

   public Bouncable createCircle() {
      return new BorderedCircle(Color.GREEN);
   }

   public Bouncable createSquare() {
      return new BorderedSquare(Color.RED);
   }
}