package Display;

import Factory.BorderedShapeFactory;
import Factory.FilledShapeFactory;
import Factory.ShapeFactory;
import Geometrical.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class BounceApp {
   private LinkedList<Bouncable> bouncers = new LinkedList<>();
   private LinkedList<Bouncable> tmp = new LinkedList<>();

   private int nbShapes = 10;
   private FrameDisplayer frame;
   private FilledShapeFactory filledFactory;
   private BorderedShapeFactory borderedFactory;

   /**
    * Constructor of the window
    */
   public BounceApp() {
      filledFactory = FilledShapeFactory.getInstance();
      borderedFactory = BorderedShapeFactory.getInstance();

      frame = FrameDisplayer.getInstance();
      frame.setTitle("Bouncers");

      frame.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
               case KeyEvent.VK_B:
                  System.out.println("B");
                  createShapes(borderedFactory);
                  break;

               case KeyEvent.VK_E:
                  System.out.println("E");
                  bouncers.clear();
                  break;

               case KeyEvent.VK_F:
                  System.out.println("F");
                  createShapes(filledFactory);
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
         for(Bouncable b : bouncers){
            b.move();
            b.draw();
         }
         frame.repaint();
         bouncers.addAll(tmp);
      }
   }

   private void createShapes(ShapeFactory f){
      for(int i = 0; i < nbShapes; ++i)
         tmp.add(f.createCircle());

      for(int i = 0; i < nbShapes; ++i)
         tmp.add(f.createSquare());
   }

   /**
    * The main part of the "app"
    */
   public static void main(String... args){
      new BounceApp().loop();
   }
}
