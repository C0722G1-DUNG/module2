package ss2.exercise;

import java.util.Scanner;

public class Show20FirstPrefix {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number1 = Integer.parseInt(scanner.nextLine());
    int count = 0;
    int N = 2;
        System.out.println("cần tìm ra :"+number1+"số nguyên tố");
        while (count<number1){
            int check = 0;
            for (int i = 1; i <=N; i++) {
                if (N%i==0){
                   check++;
                }
            }if (check==2){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
