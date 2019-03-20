package Geometrical;

import Render.Renderable;

import java.awt.*;

public class FilledSquare extends Square {
   /**
    * Filled Square constructor
    * @param color Square's color
    * @param render Renderer of the shape
    */
   public FilledSquare(Color color, Renderable render) {
      super(color, render);
   }
}