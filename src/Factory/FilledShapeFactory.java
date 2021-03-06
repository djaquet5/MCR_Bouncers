package Factory;

import Geometrical.Bouncable;
import Geometrical.FilledCircle;
import Geometrical.FilledSquare;
import Render.FilledShapeRender;

import java.awt.*;

public class FilledShapeFactory implements ShapeFactory {
   private static FilledShapeFactory instance;
   private FilledShapeRender renderer;

   /**
    * Filled Shape Factory Constructor
    */
   private FilledShapeFactory() {
      renderer = new FilledShapeRender();
   }

   /**
    * Instance Getter of FilledShapeFactory
    * @return the instance
    */
   public static FilledShapeFactory getInstance() {
      if (instance == null)
         instance = new FilledShapeFactory();

      return instance;
   }

   @Override
   public Bouncable createCircle() {
      return new FilledCircle(Color.BLUE, renderer);
   }

   @Override
   public Bouncable createSquare() {
      return new FilledSquare(Color.YELLOW, renderer);
   }
}