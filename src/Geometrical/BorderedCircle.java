package Geometrical;

import Render.Renderable;

import java.awt.*;

public class BorderedCircle extends Circle {
   /**
    * Bordered Circle constructor
    * @param color the color of the circle's border
    * @param render Renderer of the shape
    */
   public BorderedCircle(Color color, Renderable render) {
      super(color, render);
   }
}
