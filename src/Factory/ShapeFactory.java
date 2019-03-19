package Factory;

import Geometrical.Bouncable;

public interface ShapeFactory {
   public Bouncable createCircle();

   public Bouncable createSquare();
}
