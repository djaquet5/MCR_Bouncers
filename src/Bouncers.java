import javax.swing.*;

public class Bouncers {

   public static void main(String[] args){
      ShapeList shapes = new ShapeList(100);

      JFrame bouncers = new JFrame("Bouncers");

      bouncers.setSize(500, 500);
      bouncers.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      bouncers.setVisible(true);
      bouncers.add(shapes);
      shapes.setVisible(true);

      shapes.init();

      while(true)
         shapes.repaint();
   }
}
