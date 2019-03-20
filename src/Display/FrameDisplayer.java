package Display;

import Geometrical.Bouncable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

public class FrameDisplayer implements Displayer {
   private static FrameDisplayer instance;
   private JFrame bouncers;
   private BufferedImage bufferedImage;

   /**
    * FrameDisplayer constructor
    */
   private FrameDisplayer() {
      bouncers = new JFrame();
      bouncers.setContentPane(new JPanel());
      bouncers.getContentPane().setBackground(Color.white);
      bouncers.setSize(500, 500);
      bouncers.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      bouncers.setVisible(true);

      bufferedImage = new BufferedImage(bouncers.getContentPane().getWidth(), bouncers.getContentPane().getHeight(), BufferedImage.TYPE_INT_ARGB);
   }

   /**
    * Instance getter of FrameDisplayer
    * @return the instance of FrameDisplayer
    */
   public static FrameDisplayer getInstance() {
      if(instance == null)
         instance = new FrameDisplayer();

      return instance;
   }

   @Override
   public int getWidth() {
      return bouncers.getWidth();
   }

   @Override
   public int getHeight() {
      return bouncers.getHeight();
   }

   @Override
   public Graphics2D getGraphics() {
      return (Graphics2D) bouncers.getGraphics();
   }

   @Override
   public void repaint() {
      bouncers.getContentPane().getGraphics().drawImage(bufferedImage, 0, 0, null);
      bufferedImage = (BufferedImage) bouncers.getContentPane().createImage(getWidth(), getHeight());
   }

   @Override
   public void setTitle(String s) {
      bouncers.setTitle(s);
   }

   @Override
   public void addKeyListener(KeyAdapter ka) {
      bouncers.addKeyListener(ka);
   }
}