package ss4.exercise.QuadraticEquation;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation() {

    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDisscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRood1() {
        return (-b + Math.pow(getDisscriminant(), 0.5)) / 2 * a;
    }

    public double getRood2() {
        return (-b - Math.pow(getDisscriminant(), 0.5)) / 2 * a;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
