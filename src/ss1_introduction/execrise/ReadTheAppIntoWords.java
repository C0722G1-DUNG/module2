package ss1.execrise;

import java.util.Scanner;

public class ReadTheAppIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("số cần kiểm tra là"+ number1);
        int tens = number1/10;
        int ones = number1 %10;
        int hundreds = number1 /100;
        if (number1>=0&& number1<10){
            switch (number1){
                case 0 :
                    System.out.println("zero");
                    break;
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9 :
                    System.out.println("nine");
                    break;
                case 10 :
                    System.out.println("số một không");
                    break;
            }
        }
        else if (number1<20){
            switch (number1%10){
                case 1 :
                    System.out.println("số đó là eleven  có kí tự cuối là "+ number1%10);
                    break;
                case 2 :
                    System.out.println("số đó là twelve  có kí tự cuối là "+ number1%10);
                    break;
                case 3 :
                    System.out.println("số đó là thirteen  có kí tự cuối là "+ number1%10);
                    break;
                case 4 :
                    System.out.println("số đó là fourteen  có kí tự cuối là "+ number1%10);
                    break;
                case 5 :
                    System.out.println("số đó là fifteen  có kí tự cuối là "+ number1%10);
                    break;
                case 6 :
                    System.out.println("số đó là sixteen  có kí tự cuối là "+ number1%10);
                    break;
                case 7 :
                    System.out.println("số đó là seventeen  có kí tự cuối là "+ number1%10);
                    break;
                case 8 :
                    System.out.println("số đó là eighteen  có kí tự cuối là "+ number1%10);
                    break;
                case 9 :
                    System.out.println("số đó là nineteen  có kí tự cuối là "+ number1%10);
                    break;
            }
        }
        else if (number1 <=100){
            switch (tens){
                case 2 :
                    System.out.print("twenty");
                    break;
                case 3 :
                    System.out.print("thirty");
                    break;
                case 4 :
                    System.out.print("forty");
                    break;
                case 5 :
                    System.out.print("fifety");
                    break;
                case 6 :
                    System.out.print("sixty");
                    break;
                case 7 :
                    System.out.print("seventy");
                    break;
                case 8 :
                    System.out.print("eighty");
                    break;
                case 9 :
                    System.out.print("ninety");
                    break;
                case 10 :
                    System.out.print("ten");
                    break;
            }
            switch (ones){
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("sevent");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;

            }
        }
        else if (number1<=1000){
            switch (hundreds){
                case 1 :
                    System.out.println("one hundred");
                    break;
                case 2 :
                    System.out.println("two hundred");
                    break;
                case 3:
                    System.out.println("three hundred");
                    break;
                case 4 :
                    System.out.println("fourhundred");
                    break;
                case 5 :
                    System.out.println("five hundred");
                    break;
                case 6 :
                    System.out.println("six hundred");
                    break;
                case 7 :
                    System.out.println("seven hundred");
                    break;
                case 8 :
                    System.out.println("eight hundred");
                    break;
                case 9 :
                    System.out.println("nine hundred");
                    break;
            }
            switch (tens){
                case 1:
                    System.out.println("and eleven");
                    break;
                case 2:
                    System.out.println("and twity");
                    break;
                case 3:
                    System.out.println("and thiry");
                    break;
                case 4:
                    System.out.println("and fourty");
                    break;
                case 5:
                    System.out.println("and fivety");
                    break;
                case 6:
                    System.out.println("and sixty");
                    break;
                case 7:
                    System.out.println("and seventy");
                    break;
                case 8:
                    System.out.println("and eighty");
                    break;
                case 9:
                    System.out.println("and ninety");
                    break;
            }
            switch (ones){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
            }
        }
    }
