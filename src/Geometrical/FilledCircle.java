package Geometrical;

import Display.FrameDisplayer;
import Render.Renderable;

import java.awt.*;

public class FilledCircle extends Circle {
   /**
    * Filled Circle constructor
    * @param color the circle's color
    */
   public FilledCircle(Color color) {
      super(color);
   }

   @Override
   public void draw() {
      Graphics2D g2d = FrameDisplayer.getInstance().getGraphics();
      g2d.setColor(getColor());
      g2d.fillOval(getPosX(), getPosY(), getSize(), getSize());
   }

   @Override
   public Renderable getRenderer() {
      return (g, b) -> g.setColor(b.getColor());
   }
}
