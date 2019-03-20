package Geometrical;

import Render.Renderable;

import java.awt.*;

public class BorderedSquare extends Square {
   /**
    * Bordered Square constructor
    * @param color the color of the square's border
    * @param render Renderer of the shape
    */
   public BorderedSquare(Color color, Renderable render) {
      super(color, render);
   }
}
