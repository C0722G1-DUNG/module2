package ss4.exercise.QuadraticEquation;

import ss4.exercise.QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập b");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập c");
        double c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDisscriminant()>0){
            System.out.println("có 2 nghiệm"+"\t"+"nghiệm 1"+quadraticEquation.getRood1()+"\n"+quadraticEquation.getRood2());
        }
        else {
            System.out.println("the equation has no  roots");
        }
    }
}
