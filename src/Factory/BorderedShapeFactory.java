package Factory;

import Geometrical.BorderedCircle;
import Geometrical.BorderedSquare;
import Geometrical.Bouncable;
import Render.BorderedShapeRender;

import java.awt.*;

public class BorderedShapeFactory implements ShapeFactory {
   private static BorderedShapeFactory instance;
   private BorderedShapeRender renderer;

   private BorderedShapeFactory() {
      renderer = new BorderedShapeRender();
   }

   public static BorderedShapeFactory getInstance() {
      if (instance == null)
         instance = new BorderedShapeFactory();

      return instance;
   }

   @Override
   public Bouncable createCircle() {
      return new BorderedCircle(Color.GREEN, renderer);
   }

   @Override
   public Bouncable createSquare() {
      return new BorderedSquare(Color.RED, renderer);
   }
}
