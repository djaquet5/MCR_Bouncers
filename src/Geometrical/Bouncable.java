package Geometrical;

import java.awt.*;

public interface Bouncable {
   void draw();

   void moce();

   Renderable getRenderer();

   Color getColor();

   Shape getShape();
}
