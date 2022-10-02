package ss19_string_regex.execrice;

import java.util.Scanner;

public class ValidatePhone {
//    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
public static void main(String[] args) {
    String regex = "[(]\\d{2}[)][-][(]0\\d{9}[)]";
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập số điện thoại cần kiểm tra");
    String phone = scanner.nextLine();
    System.out.println(phone.matches(regex));
}
}
