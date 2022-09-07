package ss1_introduction.execrise;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hello:"+ name);
    }
}
