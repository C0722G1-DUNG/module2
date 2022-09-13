package ss6_inheritunce.exercise.execrise1;

public class Circle {
    private double radius ;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
   protected double getArea(){
        return getRadius()*Math.PI;
   }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +" diện tích "+getArea()+
                '}';
    }
}
