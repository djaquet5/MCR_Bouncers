import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class FrameDisplayer implements Displayer {
   private static FrameDisplayer instance;
   private JFrame bouncers;
   private ShapeList shapes;

   private FrameDisplayer() {
      shapes = new ShapeList(100);
      bouncers = new JFrame();

      bouncers.setSize(500, 500);
      bouncers.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      bouncers.setVisible(true);
      bouncers.add(shapes);
      shapes.setVisible(true);

      moveShapes();
   }

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
      bouncers.repaint();
   }

   @Override
   public void setTitle(String s) {
      bouncers.setTitle(s);
   }

   @Override
   public void addKeyListener(KeyAdapter ka) {
      bouncers.addKeyListener(ka);
   }

   private void moveShapes(){
      while(true){
         shapes.checkShapesMovable(bouncers.getContentPane().getBounds().width, bouncers.getContentPane().getBounds().height);
         shapes.repaint();
      }

   }
}