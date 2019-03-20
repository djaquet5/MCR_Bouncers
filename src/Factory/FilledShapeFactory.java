package Factory;

import Geometrical.Bouncable;
import Geometrical.FilledCircle;

import java.awt.*;

public class FilledShapeFactory implements ShapeFactory {
   private static FilledShapeFactory instance;

   private FilledShapeFactory() {}

   public static FilledShapeFactory getInstance() {
      if (instance == null)
         instance = new FilledShapeFactory();

      return instance;
   }

   @Override
   public Bouncable createCircle() {
      return new FilledCircle(Color.BLUE);
   }

   @Override
   public Bouncable createSquare() {
      return new FilledCircle(Color.YELLOW);
   }
}