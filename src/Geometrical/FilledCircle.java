package Geometrical;

import java.awt.*;

public class FilledCircle extends Circle {
   /**
    * Filled Circle constructor
    * @param color the circle's color
    */
   public FilledCircle(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.fillOval((int) getPosX(), (int) getPosY(), getSize(), getSize());
   }
}
