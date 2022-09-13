package ss6_inheritunce.exercise.execrise1;

import ss6_inheritunce.exercise.execrise1.Circle;

import java.util.Scanner;

public class TextCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Circle circle = new Circle();
        double i = Integer.parseInt(scanner.nextLine());
       circle.setRadius(i);
        circle.setColor("red");
        System.out.println("diện tích"+circle.toString());
    }
}
