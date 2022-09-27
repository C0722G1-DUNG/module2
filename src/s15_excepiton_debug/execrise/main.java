package s15_excepiton_debug.execrise;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        while (true) {
            try {
                System.out.println("nhập chiều dài cạnh thứ nhất");
                a = Double.parseDouble(scanner.nextLine());
                checkLength(a);
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("nhập chiều dài cạnh thứ nhất");
                b = Double.parseDouble(scanner.nextLine());
                checkLength(b);
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("nhập chiều dài cạnh thứ nhất");
                c = Double.parseDouble(scanner.nextLine());
                checkLength(c);
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

            try {
                total(a,b,c);
                System.out.println("là 3 cạnh cảu tam giác");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }



    public static void total(double a, double b, double c) throws IllegalTriangleException {
        if (a + c <= b || a + b <= c || b + c <= a) {
            throw new IllegalTriangleException("tổng 2 cạnh không lớn hơn cạnh còn lại ");
        }
    }

    public static void checkLength(double x) throws IllegalTriangleException {
        if (x <= 0) {
            throw new IllegalTriangleException("là số âm không phải cạnh tam giác");
        }
    }
}
