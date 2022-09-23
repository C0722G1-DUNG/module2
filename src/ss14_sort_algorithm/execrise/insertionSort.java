package ss14_sort_algorithm.execrise;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] myArray = {1, 5, 6, 7, 2, 3};
        for (int i = 1; i < myArray.length; i++) {
            int key = myArray[i];
            System.out.println("gắn vị trí thứ"+i +"vào biến tạm");
            int j;
            for (j = i - 1; j >= 0 && key < myArray[j]; j--) {
                myArray[j + 1] = myArray[j];
            }
            myArray[j + 1] = key;
            System.out.println("mảng đảo vị trí"+Arrays.toString(myArray));
        }
        System.out.println(Arrays.toString(myArray));
    }
}
