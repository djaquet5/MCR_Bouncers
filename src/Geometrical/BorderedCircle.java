package Geometrical;

import Display.FrameDisplayer;
import Render.Renderable;

import java.awt.*;

public class BorderedCircle extends Circle {
   /**
    * Bordered Circle constructor
    * @param color the color of the circle's border
    */
   public BorderedCircle(Color color, Renderable render) {
      super(color, render);
   }

//   @Override
//   public void draw() {
//      Graphics2D graphics2D = FrameDisplayer.getInstance().getGraphics();
//      graphics2D.setColor(getColor());
//      graphics2D.setStroke(new BasicStroke(1));
//      graphics2D.drawOval(getPosX(), getPosY(), getSize(), getSize());
//   }
}
