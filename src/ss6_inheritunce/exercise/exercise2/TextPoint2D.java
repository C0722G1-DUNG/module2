package ss6_inheritunce.exercise.exercise2;

import java.util.Arrays;

public class TextPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,1);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
