import java.awt.*;

public class Singleton implements Displayer {
   private static Singleton instance;
   private int width;
   private int height;
   private Graphics2D graphics;
   private String title;

   private Singleton() {
      width = 500;
      height = 500;

      setTitle("Bouncers");
   }

   public static Singleton getInstance() {
      if(instance == null)
         instance = new Singleton();

      return instance;
   }

   @Override
   public int getWidth() {
      return width;
   }

   @Override
   public int getHeight() {
      return height;
   }

   @Override
   public Graphics2D getGraphics() {
      return graphics;
   }

   @Override
   public void repaint() {

   }

   @Override
   public void setTitle(String s) {
      title = s;
   }
}
