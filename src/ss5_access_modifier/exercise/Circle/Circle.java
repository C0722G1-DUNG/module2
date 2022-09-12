package ss5_access_modifier.exercise.Circle;

public class Circle {
    private double radiums = 2.0;
    private String color = "red";
    Circle(){

    }
    Circle(double radiums){
        this.radiums=radiums;
    }

    private double getRadiums() {
        return radiums;
    }
    protected double getArea() {
        return Math.pow(getRadiums(),2)*Math.PI;
    }
}
