package Geometrical;

import java.awt.*;

enum Direction { HORIZONTAL, VERTICAL }

public abstract class Shape {
   private Color color;
   private int size;
   private int posX;
   private int posY;
   private Direction direction;

   public Shape(Color color){
      this.color = color;
   }


}
