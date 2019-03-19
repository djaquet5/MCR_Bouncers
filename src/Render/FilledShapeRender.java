package Render;

import Geometrical.Bouncable;
import java.awt.*;

public class FilledShapeRender implements Renderable {
   @Override
   public void display(Graphics2D g, Bouncable b) {
      // Cast in java.awt.Shape
      Shape s = (Shape) b.getShape();

      g.setColor(b.getColor());
      g.fill(s);

      g.draw(s);
   }
}
