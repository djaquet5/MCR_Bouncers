package Geometrical;

import java.awt.*;

public class BorderedSquare extends Square {
   /**
    * Bordered Square constructor
    * @param color the color of the circle's square
    */
   public BorderedSquare(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.drawRect((int) getPosX(), (int) getPosY(), getSize(), getSize());
   }
}
