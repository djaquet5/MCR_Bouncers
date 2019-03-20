package Render;

import Geometrical.Bouncable;

import java.awt.*;

public interface Renderable {
   /**
    * Display the shape
    * @param g Shape's Graphics2D
    * @param b Boucable Shape
    */
   void display(Graphics2D g, Bouncable b);
}
