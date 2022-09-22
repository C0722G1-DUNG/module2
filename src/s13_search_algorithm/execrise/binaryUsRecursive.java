package s13_search_algorithm.execrise;

import java.util.Arrays;
import java.util.Scanner;

public class binaryUsRecursive {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhập chiều dài mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int array[] = new int[n];
        for (int i = 0; i <array.length; i++) {
            System.out.println("nhập phần tử thứ"+ (i+1));
            array[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng trước khi sắp xếp"+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("mảng sau khi sắp xếp"+ Arrays.toString(array));
        System.out.println("nhập phần tử cần tìm");
        int key = Integer.parseInt(scanner.nextLine());
int index = binarySearch(array,0,array.length-1,key);
        System.out.println(index);
    }
    static int binarySearch(int[] array, int left, int right, int key) {
        if (right > left) {
            int mid = (left + right) / 2;
            if (key == array[mid]) {
               return mid;
            }
            if (key<array[mid]){
               return binarySearch(array, left, right=mid-1, key);
            }
                return binarySearch(array, left+1, right, key);

        }
        return -1;
    }


}
