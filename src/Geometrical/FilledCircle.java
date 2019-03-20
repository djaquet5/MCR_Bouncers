package Geometrical;

import Render.Renderable;

import java.awt.*;

public class FilledCircle extends Circle {
   /**
    * Filled Circle constructor
    * @param color the circle's color
    */
   public FilledCircle(Color color, Renderable render) {
      super(color, render);
   }
}
