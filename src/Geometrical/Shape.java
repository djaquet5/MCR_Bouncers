package Geometrical;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

enum Direction { HORIZONTAL, VERTICAL }

public abstract class Shape {
   private final Color color;
   private final int shapeSize;
   private int posX;
   private int posY;
   private Direction direction;

   public Shape(Color color){
      this.color = color;
      Random r = new Random();
      shapeSize = 10 + r.nextInt(40);
      posX = r.nextInt(500 - shapeSize /2) + shapeSize /2;
      posY = r.nextInt(500 - shapeSize /2) + shapeSize /2;
   }

   public int getShapeSize(){
      return shapeSize;
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

   public Color getColor() {
      return color;
   }
}
