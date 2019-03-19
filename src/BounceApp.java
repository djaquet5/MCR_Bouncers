import Geometrical.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class BounceApp {
   private LinkedList<Bouncable> bouncers = new LinkedList<>();

   /**
    * The main part of the "app"
    */
   // TODO
   public BounceApp() {
      Displayer frame = FrameDisplayer.getInstance();
      frame.setTitle("Bouncers");
      frame.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
               case KeyEvent.VK_E:
                  System.out.println("E");
                  break;

               case KeyEvent.VK_B:
                  System.out.println("B");
                  break;

               case KeyEvent.VK_F:
                  System.out.println("F");
                  break;

               case KeyEvent.VK_Q:
                  System.out.println("Q");
                  break;
            }
         }
      });
   }

   /**
    * the program loop
    */
   // TODO
   public void loop() {}

   public static void main(String... args){
//      ShapeList shapes = new ShcapeList(100);
//
//      JFrame bouncers = new JFrame("BounceApp");
//
//      bouncers.setSize(500, 500);
//      bouncers.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//      bouncers.setVisible(true);
//      bouncers.add(shapes);
//      shapes.setVisible(true);
//
//      while(true){
//         shapes.checkShapesMovable(bouncers.getBounds().width, bouncers.getBounds().height);
//         shapes.repaint();
//      }
      new BounceApp();
      FrameDisplayer.getInstance();

      // Only main line
   }
}
