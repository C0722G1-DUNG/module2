package bt_themMvc.controller;

import bt_themMvc.service.IStudentService;
import bt_themMvc.service.studentService;

import java.util.Scanner;

public class studentController {
    private static IStudentService iStudentService = new studentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        while (true) {
            System.out.println("-------------");
            System.out.println("chào mừng đến với chương trình codegym");
            System.out.println("1 thêm danh sách hs mới");
            System.out.println("2 hiển thị danh sách hs mới");
            System.out.println("3 xóa danh sách hs mới");
            System.out.println("4 thoát");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayStudent();
                    break;
                case 3:
                    iStudentService.remoStudet();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
