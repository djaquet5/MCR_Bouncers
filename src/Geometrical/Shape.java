package Geometrical;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
   private final Color color;
   private final int size;
   private double posX;
   private double posY;
   private Vector direction;
   private int speed;

   public Shape(Color color){
      this.color = color;
      Random r = new Random();

      size = getRandomInt(10,40, r);

      posX = getRandomInt(0, 485 - size, r);
      posY = getRandomInt(0, 460 - size, r);
      
      direction = new Vector(getRandomInt(-10, 10, r), getRandomInt(-10, 10 ,r));

      speed = getRandomInt(1,5, r);
   }

   public void move() {
      posX += Math.cos(direction.getAngle()) / speed;
      posY += Math.sin(direction.getAngle()) / speed;
   }

   public void invertDirection(boolean wall) {
      if (wall){
         direction.setX(-direction.getX());
      } else {
         direction.setY(-direction.getY());
      }
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
      return direction.getAngle();
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
