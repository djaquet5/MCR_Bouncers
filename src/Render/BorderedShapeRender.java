package Render;

import Geometrical.Bouncable;

import java.awt.*;

public class BorderedShapeRender {
   private final int STROKE_SIZE = 5;

   public void display(Graphics2D g, Bouncable b) {
      g.setColor(b.getColor());
      g.setStroke(new BasicStroke(STROKE_SIZE));

      g.draw((Shape)b.getShape());
   }
}
