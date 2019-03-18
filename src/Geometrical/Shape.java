package Geometrical;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
   private final Color color;
   private final int size;
   private double posX;
   private double posY;
   private Vector direction;

   public Shape(Color color){
      this.color = color;
      Random r = new Random();

      size = getRandomInt(10,40, r);

      posX = getRandomInt(0, 485 - size, r);
      posY = getRandomInt(0, 460 - size, r);
      
      direction = new Vector((r.nextDouble()*2) - 1, (r.nextDouble()*2) - 1);
   }

   public void move() {
      posX += direction.getX();
      posY += direction.getY();
   }

   public void invertDirection(boolean wall) {
      if (wall){
         direction.setX(-direction.getX());
      } else {
         direction.setY(-direction.getY());
      }
   }

   public Vector getDirection() {
      return direction;
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

   private static int getRandomInt(int min, int max, Random r) {
      if (min >= max)
         throw new IllegalArgumentException("max must be greater than min");

      return r.nextInt((max - min) + 1) + min;
   }

   public abstract void paintComponent(Graphics g);
}
