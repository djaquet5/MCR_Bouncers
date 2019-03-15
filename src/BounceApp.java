import Geometrical.Bouncable;
import java.util.LinkedList;

public class BounceApp {
   private LinkedList<Bouncable> bouncers;
   // Autres attributs

   // TODO
   public BounceApp() {}

   // TODO
   public void loop() {}

   public static void main(String... args){
//      ShapeList shapes = new ShapeList(100);
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
      FrameDisplayer.getInstance();

      // Only main line
//      new BounceApp().loop();
   }
}
