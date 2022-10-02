package ss19_string_regex.execrice;

import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[CPA]\\d{4}[GHIKLM]$";
        String name;
        while (true) {
            System.out.println("nhập tên lớp cần kiểm tra");
            name = scanner.nextLine();
            System.out.println(name.matches(regex));
            if (name.matches(regex) == false) {
                System.out.println("nhập sai class vui lòng nhập lại");
            } else {
                break;
            }
        }


    }
}


