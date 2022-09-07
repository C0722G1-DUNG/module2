package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 5, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("số cần xóa là");
        System.out.println("mảng lúc đầu" + Arrays.toString(arr1));
        int number1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr1.length; i++) {
            if (number1 == arr1[i]) {
                for (int j = i; j < arr1.length - 1; j++) {
                    arr1[j] = arr1[j + 1];
                }
                arr1[arr1.length - 1] = 0;
                i--;
            }
        }
        System.out.println("mảng mới " + Arrays.toString(arr1));
    }
}
