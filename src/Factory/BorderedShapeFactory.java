package Factory;

import Geometrical.BorderedCircle;
import Geometrical.BorderedSquare;
import Geometrical.Bouncable;

import java.awt.*;

public class BorderedShapeFactory implements ShapeFactory {
   private static BorderedShapeFactory instance;

   private BorderedShapeFactory() {}

   public static BorderedShapeFactory getInstance() {
      if (instance == null)
         instance = new BorderedShapeFactory();

      return instance;
   }

   @Override
   public Bouncable createCircle() {
      return new BorderedCircle(Color.GREEN);
   }

   @Override
   public Bouncable createSquare() {
      return new BorderedSquare(Color.RED);
   }
}
