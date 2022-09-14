package ss7.execrise.execrise2;

public class Ractangle implements Colorable {

    private double width = 1.0;
    private double length = 1.0;

    public Ractangle() {
    }

    public Ractangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    @Override
    public String toString() {
        return "Area"
               +getArea()+','
                + super.toString();
    }

    @Override
    public void howToColor() {

    }
}
