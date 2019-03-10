package Geometrical;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
   private final Color color;
   private final int size;
   private int posX;
   private int posY;
   private double direction;     // Direction is in degree and between 0-359
   private int speed;

   public Shape(Color color){
      this.color = color;
      Random r = new Random();

      size = getRandomInt(10,40, r);

      posX = getRandomInt(size/2, 500, r);
      posY = getRandomInt(size/2, 500, r);

      direction = r.nextDouble() % 360;

      speed = getRandomInt(1,5, r);
   }

   public abstract void paintComponent(Graphics g);

   public void move() {

   }

   public Color getColor() {
      return color;
   }

   public int getPosX() {
      return posX;
   }

   public int getPosY() {
      return posY;
   }

   public int getSize() {
      return size;
   }

   private static int getRandomInt(int min, int max, Random r) {
      if (min >= max)
         throw new IllegalArgumentException("max must be greater than min");

      return r.nextInt((max - min) + 1) + min;
   }
}
