package textFun;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    private static Scanner scanner = new Scanner(System.in);
    private static Stack<String> brackets = new Stack<>();

    public static void main(String[] args) {
        System.out.println("nhập biểu thức cần kiểm tra");
        String mathExpression = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i <mathExpression.length(); i++) {
            if (mathExpression.charAt(i)=='('){
                brackets.push(mathExpression.charAt(i)+"");
            }
            else if (mathExpression.charAt(i)==')'){
                if (brackets.isEmpty()){
                    check = false;
                    break;
                }
                else {
                    brackets.pop();
                }
            }
        }
        if (!brackets.isEmpty()){
            check=false;
        }
        System.out.println(check);
    }
}
