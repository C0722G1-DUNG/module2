package s11;

import java.util.Scanner;
import java.util.Stack;

public class exceri1 {
    private static Scanner scanner = new Scanner(System.in);
  private static   Stack<String> numbers = new Stack<>();
    public static void main(String[] args) {
        System.out.println("nhập 1 số nguyên dương từ bàn phím");
        int number = Integer.parseInt(scanner.nextLine());
       while (number>0){
           int check = number%2;
           numbers.push(check+"");
           number=number/2;
       }
        System.out.println("số nhị phân là");
       int numLeng = numbers.size();
        for (int i = 0; i <numLeng; i++) {
            System.out.print( numbers.pop());
        }
    }
}
