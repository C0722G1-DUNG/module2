package ss4.exercise.Fan;

public class Fan {
    final int Slow = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = Slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()){
        return "Fan is on{" +
                "speed=" + this.speed +
                ", on=" + this.on +
                ", radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    } else {
            return "Fan is off{" +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        }
    }

}
