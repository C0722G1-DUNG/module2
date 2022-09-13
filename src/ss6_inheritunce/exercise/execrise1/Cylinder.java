package ss6_inheritunce.exercise.execrise1;

import ss6_inheritunce.exercise.execrise1.Circle;

public class Cylinder extends Circle {
 private double radius;
 private String color;
 private double hight;
    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getVolume(){
     return super.getArea()*this.hight;
 }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", hight=" + hight +
                '}';
    }
}
