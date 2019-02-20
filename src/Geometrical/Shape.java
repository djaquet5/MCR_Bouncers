package Geometrical;

import java.awt.*;
import java.util.Random;


enum Direction { HORIZONTAL, VERTICAL }

public abstract class Shape {
   private final Color color;
   private final int size;
   private int posX;
   private int posY;
   private Direction direction;

   public Shape(Color color){
      this.color = color;
      Random r = new Random();
      size = 10 + r.nextInt(40);
      posX = r.nextInt(500 - size/2) + size/2;
      posY = r.nextInt(500 - size/2) + size/2;
   }

   public int getPosX() {
      return posX;
   }

   public void setPosX(int posX) {
      this.posX = posX;
   }

   public int getPosY() {
      return posY;
   }

   public void setPosY(int posY) {
      this.posY = posY;
   }
}
