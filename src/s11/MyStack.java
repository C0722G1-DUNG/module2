package s11;

import java.util.*;

public class MyStack<E> {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Đảo ngược chuỗi sử dụng Stack
//        Stack<String> chainLish = new Stack<>();
//        System.out.println("nhập chuỗi ban đầu");
//        String chain = scanner.nextLine();
//        for (int i = 0; i <chain.length(); i++) {
//            chainLish.push(chain.charAt(i)+"");
//        }
//        System.out.println("chuỗi đảo ngược");
//        for (int i = 0; i <chain.length(); i++) {
//            System.out.print( chainLish.pop());
//        }
//        Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        Stack<Integer> chainLisArray = new Stack<>();
        System.out.println("nhập chiều dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array= new  int[size];
        for (int i = 0; i <size; i++) {
           array[i] = Integer.parseInt(scanner.nextLine());
           chainLisArray.push(array[i]);
        }
        System.out.print("mảng lúc đầu"+ Arrays.toString(array));
        System.out.println("mảng đảo ngược");
        for (int i = 0; i <size; i++) {
            System.out.print( chainLisArray.pop());
        }
        }
    }

