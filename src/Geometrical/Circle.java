package Geometrical;

import java.awt.*;

public abstract class Circle extends Shape {
   public Circle(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      g.setColor(getColor());
      move();
   }
}
