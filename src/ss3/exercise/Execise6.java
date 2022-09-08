package ss3.exercise;

import java.util.Scanner;
public class Execise6 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{5,6,7},{7,8,9}};
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("cột cần tính");
        int num1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <arr1.length; i++) {
                  sum+= arr1[i][num1];
            }

        System.out.println("tổng cột đó là"+sum);
    }
    }
