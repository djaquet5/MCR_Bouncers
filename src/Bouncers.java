import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import Geometrical.*;
import Geometrical.Shape;

public class Bouncers {

   public static void main(String[] args){
      JFrame bouncers = new JFrame("Bouncers");
      bouncers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bouncers.setSize(500, 500);
      bouncers.setVisible(true);

      ShapeList shapes = new ShapeList();
      bouncers.add(shapes);

      shapes.drawing();
   }
}
