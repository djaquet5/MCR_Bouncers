package Geometrical;

public class Vector {
    private int x;
    private int y;

    private double angle;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
        generateAngle();
    }

    public void generateAngle() {
        angle = Math.floor(Math.tanh(Math.abs(y)/(double)Math.abs(x)));
        if (y < 0) {
            angle = 360 - angle;
        }
    }

    public double getAngle() {
        return angle;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        generateAngle();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        generateAngle();
    }
}
