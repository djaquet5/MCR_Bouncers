package Geometrical;

import Display.FrameDisplayer;
import Render.Renderable;

import java.awt.*;
import java.awt.geom.RectangularShape;
import java.util.Random;

public abstract class BouncableShape implements Bouncable {
   private final Color color;
   private final int size;
   private int posX;
   private int posY;
   private Vector direction;
   private Renderable renderer;
   private FrameDisplayer frame;

   /**
    * BouncableShape constructor
    * @param color the color of the shape
    */
   public BouncableShape(Color color, Renderable renderer){
      this.color = color;
      this.renderer = renderer;

      frame = FrameDisplayer.getInstance();

      Random r = new Random();

      size = getRandomInt(10,40, r);

      posX = getRandomInt(0, frame.getWidth() - size, r);
      posY = getRandomInt(0, frame.getHeight() - size, r);
      
      direction = new Vector(getRandomInt(-5, 5, r), getRandomInt(-5, 5, r));
   }

   /**
    * Moves the shape
    */
   public void move() {
      checkShapesMovable(frame.getWidth(), frame.getHeight());
      posX += direction.getX();
      posY += direction.getY();

      // Display the new frame
      // RectangularShape is the super class of Ellipse2D.Double and Rectangle2D.Double
      ((RectangularShape) (getShape())).setFrame(posX, posY, size, size);
   }

   /**
    * Inverts the movement direction of a shape when it hits a boundary
    * @param wall true for top and bottom, false for left and right
    */
   public void invertDirection(boolean wall) {
      if (wall){
         direction.setX(-direction.getX());
      } else {
         direction.setY(-direction.getY());
      }
   }

   /**
    * Check if the next movement of the shapes will result in them hitting a wall and, if so, inverting their direction
    * @param maxWidth the width of the frame
    * @param maxHeight the height of the frame
    */
   public void checkShapesMovable(int maxWidth, int maxHeight){
      double newPosX = posX + direction.getX();
      double newPosY = posY + direction.getY();

         if(newPosX < 0 || newPosX > maxWidth)
            invertDirection(true);
         else if (newPosY < 0 || newPosY > maxHeight)
            invertDirection(false);
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

   @Override
   public Renderable getRenderer() {
      return renderer;
   }

   @Override
   public void draw() {
      renderer.display(frame.getGraphics(), this);
   }

   /**
    * Method to get a random integer between a lower and upper bound
    * @param min the lower bound
    * @param max the upper bound
    * @param r the random number generator
    * @return a random number between min and max
    */
   private static int getRandomInt(int min, int max, Random r) {
      if (min >= max)
         throw new IllegalArgumentException("max must be greater than min");

      return r.nextInt((max - min) + 1) + min;
   }
}
