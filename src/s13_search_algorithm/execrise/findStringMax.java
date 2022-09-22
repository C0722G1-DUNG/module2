package s13_search_algorithm.execrise;

import java.util.LinkedList;
import java.util.Scanner;

public class findStringMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập chuỗi vào");
        String string =input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i <string.length(); i++) {
             LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = 1; j <string.length(); j++) {
                if (string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (max.size()<list.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max){
            System.out.print(ch);
        }
    }
}
