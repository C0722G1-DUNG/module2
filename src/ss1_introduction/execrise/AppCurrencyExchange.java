package ss1.execrise;

import java.util.Scanner;

public class AppCurrencyExchange {
    public static void main(String[] args) {
        System.out.println("tỉ giá  23000VND/USD");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền USD");
        double USD = scanner.nextDouble();
        System.out.printf("Tính giá trị VND "+"%.0f*23000= %.0f",USD,USD*23000);

    }
}
