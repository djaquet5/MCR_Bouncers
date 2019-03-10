package Geometrical;

import java.awt.*;

public class Square extends Shape {
   public Square(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      g.setColor(getColor());
      g.fillRect(getPosX(), getPosY(), getSize(), getSize());
   }
}
