package Geometrical;

public class Vector {
    private int x;
    private int y;

    /**
     * Vector Constructor
     * @param x the vector abscissa
     * @param y the vector ordinate
     */
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
