package ss7.execrise.execrise2;

public class Circle implements Colorable {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Area"+getArea()+super.toString()
                ;
    }

    @Override
    public void howToColor() {

    }
}
