package ss14_sort_algorithm.execrise;

import java.util.Arrays;

public class settingInsertionSort {
    public static void main(String[] args) {
        int[] myArray = {1,5,2,7,9,3,4,6};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    public static void insertionSort(int[] lish){
        for (int i = 1; i < lish.length; i++) {
            int key = lish[i];
            int j;
            for (j = i - 1; j >= 0 && key < lish[j]; j--) {
                lish[j + 1] = lish[j];
            }
            lish[j + 1] = key;
        }
    }
}
