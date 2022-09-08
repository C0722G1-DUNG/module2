package ss3.exercise;

import java.util.Arrays;

public class Execise4 {
    public static void main(String[] args) {
        int[][] arrr1 = {{1,2,3,4},{5,6,7,8}};
        System.out.println("mảng khởi tạo" + Arrays.toString(arrr1));
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
