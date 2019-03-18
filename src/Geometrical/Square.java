package Geometrical;

import java.awt.*;

public abstract class Square extends Shape {
   public Square(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      g.setColor(getColor());

      move();
   }
}
