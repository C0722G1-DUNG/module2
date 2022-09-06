package ss1.practice;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Float height;
        Float width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("width");
        width = scanner.nextFloat();
        System.out.println("height");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println(area);
    }
}
