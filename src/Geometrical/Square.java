package Geometrical;

import Render.Renderable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Square extends BouncableShape {
   private Shape shape;
   /**
    * Generic Square constructor
    * @param color the color of the square's border
    * @param render Renderer of the shape
    */
   public Square(Color color, Renderable render) {
      super(color, render);

      shape = new Rectangle2D.Double(getPosX(), getPosY(), getSize(), getSize());
   }

   @Override
   public Shape getShape() {
      return shape;
   }
}
