package Geometrical;

import Render.Renderable;

import java.awt.*;

public class FilledSquare extends Square {
   /**
    * Filled Square constructor
    * @param color the square's color
    */
   public FilledSquare(Color color, Renderable render) {
      super(color, render);
   }
}