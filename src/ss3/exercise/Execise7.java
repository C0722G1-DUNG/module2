package ss3.exercise;

import java.util.Scanner;

public class Execise7 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{5,6,7},{7,8,9}};
        int sum =0;
        for (int i = 0; i <arr1.length; i++) {
           sum+= arr1[i][i];
        }
        System.out.println("tổng cột đó là"+sum);
    }
}
