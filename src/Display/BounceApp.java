package Display;

import Factory.BorderedShapeFactory;
import Factory.FilledShapeFactory;
import Geometrical.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class BounceApp {
   static private LinkedList<Bouncable> bouncers = new LinkedList<>();
   private FrameDisplayer frame;

   /**
    * The main part of the "app"
    */
   public BounceApp() {
      frame = FrameDisplayer.getInstance();
      frame.setTitle("Bouncers");
      frame.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
               case KeyEvent.VK_E:
                  System.out.println("E");
                  bouncers.clear();
                  break;

               case KeyEvent.VK_B:
                  System.out.println("B");
                  new BorderedShapeFactory().createShapes();
                  break;

               case KeyEvent.VK_F:
                  System.out.println("F");
                  new FilledShapeFactory().createShapes();
                  break;

               case KeyEvent.VK_Q:
                  System.out.println("Q");
                  System.exit(0);
                  break;
            }
         }
      });
   }
   
   /**
    * the program loop
    */
   public void loop() {
      while (true){
         frame.repaint();
      }
   }

   public static LinkedList<Bouncable> getBouncers() {
      return bouncers;
   }

   public static void main(String... args){
      new BounceApp().loop();
   }
}
