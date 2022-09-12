package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Execise4 {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhập số lượng phần tử của mảng");
            n = Integer.parseInt(scanner.nextLine());
            if (n<0){
                System.out.println("vui lòng nhập lại");
            }
        }while (n<0);
        System.out.println("nhập chiều dài phần tử ");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] arrr1 = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                    arrr1[i][j]= Integer.parseInt(scanner.nextLine());
            }
            System.out.println("\n");
        }
        System.out.println("giá trị lớn nhất"+checkMax(arrr1));
    }
    static long checkMax(int[][] arr2){
        int max = 0;
        for (int i = 0; i <arr2.length; i++) {
            for (int j = 0; j <arr2[i].length; j++) {
                if (arr2[i][j]>max){
                    max=arr2[i][j];
                }
            }
        }return max;
    }
}
