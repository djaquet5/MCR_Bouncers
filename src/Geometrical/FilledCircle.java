package Geometrical;

import Render.Renderable;

import java.awt.*;

public class FilledCircle extends Circle {
   /**
    * Filled Circle constructor
    * @param color Circle's color
    * @param render Renderer of the shape
    */
   public FilledCircle(Color color, Renderable render) {
      super(color, render);
   }
}
