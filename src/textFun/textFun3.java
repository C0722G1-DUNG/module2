package textFun;

import java.util.Arrays;

public class textFun3 {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 1, 20, 51};
        for (int i = 0; i < myArray.length - 1; i++) {
            int minvalue = myArray[i];
            int minindex = i;
            for (int j = i + 1; j < myArray.length - 1; j++) {
                if (minvalue>myArray[j]){
                    minvalue= myArray[j];
                    minindex=j;
                }
            }
            if (minindex!=i){
                int temp =myArray[i];
                myArray[i]=minvalue;
                myArray[minindex]=temp;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
