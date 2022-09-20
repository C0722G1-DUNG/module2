package s11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindromeUsingQueue {
    private static Scanner scanner = new Scanner(System.in);
    private static Stack<String> strings = new Stack<>();
    private static Queue<String> strings2 = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(" chuỗi cần kiểm tra");
//        String str = "Able was I ere I saw Elba";
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            strings.push(str.charAt(i) + "");
        }
        System.out.println("chuổi đảo ngược");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(strings.pop());
        }
        System.out.println(" ");
        for (int i = 0; i < str.length(); i++) {
            strings2.add(str.charAt(i) + "");
        }
        System.out.println("chuỗi k đảo ngược");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(strings2.poll());
        }
        System.out.println("");
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            strings.push(str.charAt(i) + "");
            strings2.add(str.charAt(i) + "");
        }
        for (int i = 0; i <strings.size(); i++) {
            if (!strings.pop().equals(strings2.poll())) {
                check = false;
                break;
            }
            check= true;
        }
        if (check) {
            System.out.println("oke");
        } else {
            System.out.println("no oke");
        }
    }
}
