package Geometrical;

import Display.FrameDisplayer;
import Render.Renderable;

import java.awt.*;

public class BorderedSquare extends Square {
   /**
    * Bordered Square constructor
    * @param color the color of the circle's square
    */
   public BorderedSquare(Color color) {
      super(color);
   }

   @Override
   public void draw() {
      Graphics2D graphics2D = FrameDisplayer.getInstance().getGraphics();
      graphics2D.setColor(getColor());
      graphics2D.setStroke(new BasicStroke(1));
      graphics2D.drawRect(getPosX(), getPosY(), getSize(), getSize());
   }

   @Override
   public Renderable getRenderer() {
      return (g, b) -> g.setColor(b.getColor());
   }
}
