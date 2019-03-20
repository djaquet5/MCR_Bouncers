package Factory;

import Geometrical.Bouncable;

public interface ShapeFactory {
   Bouncable createCircle();

   Bouncable createSquare();
}
