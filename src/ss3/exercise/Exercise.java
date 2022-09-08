package ss3.exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {


    String a = "hello";
    int count = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("tìm chữ cần xuất hiện trong mảng");
    char b =scanner.nextLine().charAt(0);
        for (int i = 0; i <a.length(); i++) {
            if (b==a.charAt(i)){
                count++;
            }
        }
        System.out.println("số lần xuất hiện"+count);
}
}