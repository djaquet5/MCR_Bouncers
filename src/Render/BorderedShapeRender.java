package Render;

import Geometrical.Bouncable;

import java.awt.*;

public class BorderedShapeRender implements Renderable{
   private final int STROKE_SIZE = 5;

   @Override
   public void display(Graphics2D g, Bouncable b) {
      g.setColor(b.getColor());
      g.setStroke(new BasicStroke(STROKE_SIZE));

      g.draw(b.getShape());
   }
}
