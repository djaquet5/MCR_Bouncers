package Factory;

import Geometrical.Bouncable;

public interface ShapeFactory {
   public abstract Bouncable createCircle();

   public abstract Bouncable createSquare();

//   public void createShapes() {
//      Random random = new Random();
//      int nbShapes = 100;
//
//      for(int i = 0; i < nbShapes; ++i) {
//         Bouncable newShape;
//         if (random.nextBoolean())
//            newShape = createSquare();
//         else
//            newShape = createCircle();
//
//         BounceApp.getBouncers().add(newShape);
//      }
//   }
}
