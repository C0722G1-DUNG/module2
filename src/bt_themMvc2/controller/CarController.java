package bt_themMvc2.controller;

import java.util.Scanner;

public class CarController {
    private static Scanner scanner = new Scanner(System.in);
    public static void menuCar() {
        while (true){
            System.out.println("chọn chức năng");
            System.out.println("1.thêm mới phương tiện");
            System.out.println("2.hiển thị phương tiện");
            System.out.println("3.xóa phương tiện");
            System.out.println("4.tìm kiếm theo biển phương tiện");
            System.out.println("5.thoát");
            System.out.println("_______________");
            System.out.println("mời bạn lựa chọn chức năng");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
