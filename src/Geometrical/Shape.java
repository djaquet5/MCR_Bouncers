package Geometrical;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
   private final Color color;
   private final int size;
   private int posX;
   private int posY;
   private double dirX;
   private double dirY;
   private int speed;

   public Shape(Color color){
      Random r = new Random();
      this.color = color;

      size = getRandomInt(10,40, r);

      posX = getRandomInt(size/2, 500, r);
      posY = getRandomInt(size/2, 500, r);

      dirX = r.nextDouble();
      dirY = r.nextDouble();

      speed = getRandomInt(1,5, r);
   }

   public int getSize(){
      return size;
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

   private static int getRandomInt(int min, int max, Random r) {
      if (min >= max)
         throw new IllegalArgumentException("max must be greater than min");

      return r.nextInt((max - min) + 1) + min;
   }
}
