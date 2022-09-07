package ss2.exercise;

import java.util.Scanner;

public class Show100FirstPrefix {
    public static void main(String[] args) {
        int number1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập số cần keiemr tra vào");
             number1 = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= number1; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
                if (number1<2){
                    System.out.println("vui lòng nhập lại");
                }
            }
        }while (number1<2);
    }
}
