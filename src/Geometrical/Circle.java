package Geometrical;

import java.awt.*;

public class Circle extends Shape {
   public Circle(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      g.setColor(getColor());
      g.fillOval(getPosX(), getPosY(), getSize(), getSize());
   }
}
