package ss6_inheritunce.exercise.exercise2;

public class Point2D {
    private float x = 0.0F;
    private float y = 0.0F;

    Point2D(){

    }
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {

    }

    public float getY() {
        return y;
    }

    public void setY(float y) {

    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[2];
    }

    @Override
    public String toString() {
        return "Point2D"+'"'+"(" +
                "x=" + x +
                ", y=" + y +
                ")"+'"';
    }
}
