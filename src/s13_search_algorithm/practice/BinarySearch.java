package s13_search_algorithm.practice;

import java.awt.*;
import java.util.Scanner;

public class BinarySearch {
    static int[] lish = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static Scanner scanner = new Scanner(System.in);
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        String check = "sai";
        while (high >= low) {
            int mid = (low + high) / 2;

             if (key == list[mid])
                return mid;
            if (key < list[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(lish, 2));  /* 0 */
        System.out.println(binarySearch(lish, 11)); /* 4 */
        System.out.println(binarySearch(lish, 79)); /*12 */
        System.out.println(binarySearch(lish, 1));  /*-1 */
        System.out.println(binarySearch(lish, 5));  /*-1 */
        System.out.println(binarySearch(lish, 80)); /*-1 */
    }
}
