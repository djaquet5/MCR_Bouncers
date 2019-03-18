package Geometrical;

import java.awt.*;

public class BorderedCircle extends Circle {
   public BorderedCircle(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawOval((int) getPosX(), (int) getPosY(), getSize(), getSize());
   }
}
