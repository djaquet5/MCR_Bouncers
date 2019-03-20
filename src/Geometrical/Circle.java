package Geometrical;

import Render.Renderable;

import java.awt.*;
import java.awt.geom.Ellipse2D;


public abstract class Circle extends BouncableShape {
   private Shape shape;
   /**
    * Generic Circle constructor
    */
   public Circle(Color color, Renderable render) {
      super(color, render);

      shape = new Ellipse2D.Double(getPosX(), getPosY(), getSize(), getSize());
   }

   @Override
   public Shape getShape() {
      return shape;
   }
}
