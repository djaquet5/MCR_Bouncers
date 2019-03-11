package Geometrical;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
   private final Color color;
   private final int size;
   private double posX;
   private double posY;
   private double direction;     // Direction is in degree and between 0-359
   private int speed;

   public Shape(Color color){
      this.color = color;
      Random r = new Random();

      size = getRandomInt(10,40, r);

      posX = getRandomInt(0, 485 - size, r);
      posY = getRandomInt(0, 460 - size, r);

      direction = r.nextDouble() % 360;

      speed = getRandomInt(1,5, r);
   }

   public void move() {
      posX += Math.cos(direction) / speed;
      posY += Math.sin(direction) / speed;
   }

   public void invertDirection() {
      direction = (direction + 180) % 360;
   }

   public Color getColor() {
      return color;
   }

   public double getPosX() {
      return posX;
   }

   public double getPosY() {
      return posY;
   }

   public int getSize() {
      return size;
   }

   public double getDirection() {
      return direction;
   }

   public int getSpeed() {
      return speed;
   }

   private static int getRandomInt(int min, int max, Random r) {
      if (min >= max)
         throw new IllegalArgumentException("max must be greater than min");

      return r.nextInt((max - min) + 1) + min;
   }

   public abstract void paintComponent(Graphics g);
}
