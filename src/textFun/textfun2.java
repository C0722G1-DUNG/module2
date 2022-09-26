package textFun;

import java.util.Arrays;

public class textfun2 {
    public static void main(String[] args) {
    int[] myArray = {1,5,112,54,10};
        for (int i = 0; i <myArray.length-1; i++) {
            for (int j = myArray.length-1; j >i; j--) {
               if (myArray[j]<myArray[j-1]){
                int temp = myArray[j-1];
                myArray[j-1]=myArray[j];
                myArray[j]=temp;
            }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
