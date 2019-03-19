package Geometrical;

import Display.FrameDisplayer;
import Render.Renderable;

import java.awt.*;

public class FilledSquare extends Square {
   /**
    * Filled Square constructor
    * @param color the square's color
    */
   public FilledSquare(Color color) {
      super(color);
   }

   @Override
   public void draw() {
      Graphics2D graphics2D = FrameDisplayer.getInstance().getGraphics();
      graphics2D.setColor(getColor());
      graphics2D.fillRect(getPosX(), getPosY(), getSize(), getSize());
   }

   @Override
   public Renderable getRenderer() {
      return (g, b) -> g.setColor(b.getColor());
   }
}