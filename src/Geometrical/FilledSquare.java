package Geometrical;

import java.awt.*;

public class FilledSquare extends Square {
   public FilledSquare(Color color) {
      super(color);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.fillRect((int) getPosX(), (int) getPosY(), getSize(), getSize());
   }
}
