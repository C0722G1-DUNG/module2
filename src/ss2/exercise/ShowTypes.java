package ss2.exercise;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hình muốn vẽ");
        while (choice != 4) {
            System.out.println("MEnu");
            System.out.println("1. print the ractangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (i == j || i == 7 || j == 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }

        }
    }
}
