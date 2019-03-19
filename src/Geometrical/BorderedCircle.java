package Geometrical;

import java.awt.*;

public class BorderedCircle extends Circle {
   /**
    * Bordered Circle constructor
    * @param color the color of the circle's border
    */
   public BorderedCircle(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawOval((int) getPosX(), (int) getPosY(), getSize(), getSize());
   }
}
