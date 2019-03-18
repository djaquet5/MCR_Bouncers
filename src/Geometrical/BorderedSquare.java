package Geometrical;

import java.awt.*;

public class BorderedSquare extends Square {
   public BorderedSquare(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.drawRect((int) getPosX(), (int) getPosY(), getSize(), getSize());
   }
}
