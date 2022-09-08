package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exrcise3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,12};
        int[] arr3 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]= arr1[i];
        }
        for (int i = 0; i <arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
