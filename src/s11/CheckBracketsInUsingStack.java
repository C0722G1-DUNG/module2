package s11;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsInUsingStack {
    private static Stack<Character> brackets = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check = false;
        System.out.println("nhập biểu thức cần kiểm tra");
        String mathExpression = scanner.nextLine();

        for (int i = 0; i < mathExpression.length(); i++) {
            char c = mathExpression.charAt(i);
            if (c == '(') {
                brackets.push(mathExpression.charAt(i) );
            }
            else if (c==')'){
                if (brackets.isEmpty()){
                    check=false;
                    break;
                }
                else {
                    Character lets = brackets.pop();
                    if (!(lets=='(')){
                        check = false;
                        break;
                    }
                }

            } if (i == mathExpression.length() - 1) {
                check = brackets.isEmpty();
            }

        }
        if (check){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
