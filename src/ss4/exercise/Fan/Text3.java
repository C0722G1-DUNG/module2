package ss4.exercise.Fan;

import ss4.exercise.Fan.Fan;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    Fan fan1 = new Fan();
    fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.FAST);
        fan2.setRadius(fan2.radius);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
    }

