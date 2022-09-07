package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp vị trí cần thêm");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập phần tử cần thêm");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("vị trí cần thêm phần tử"+index);
        System.out.println("thêm phần tử"+number);
        for (int i =1; i <arr1.length; i++) {
            if (index==arr1[i]){
                for (int j = arr1.length-1; j >index; j--) {
                    arr1[j]=arr1[j-1];
                }
                arr1[index]=number;
            }
        }
        System.out.println("mảng mới"+ Arrays.toString(arr1));
    }
}
