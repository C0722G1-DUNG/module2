package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Execise5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
        System.out.println("số lượng phần tử của mảng");
        number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            System.out.println("please ");
        }
    }while (number<0);
    int[] arr1 = new int[number];
        for (int i = 0; i <arr1.length; i++) {
            System.out.printf("nhập vào arr[%d]",i);
            arr1[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng khởi tạo"+ Arrays.toString(arr1));
        System.out.println("giá trị nhỏ nhất trong mảng"+checkMin(arr1));
    }
    static long checkMin(int[] arr2){
        int min = arr2[0];
        for (int i = 1; i <arr2.length; i++) {
            if (arr2[i]<min){
                min= arr2[i];
            }
        }
    return min;
    }
}