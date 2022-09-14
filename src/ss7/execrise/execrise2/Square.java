package ss7.execrise.execrise2;

public class Square extends Ractangle implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Area"+super.getArea()+super.toString();
    }
}
