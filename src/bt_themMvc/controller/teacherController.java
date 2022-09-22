package bt_themMvc.controller;

import bt_themMvc.service.ITeacherService;
import bt_themMvc.service.teacherService;

import java.util.Scanner;

public class teacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherService iTeacherService = new teacherService();

    public static void menuTeacher() {
        while (true) {
            System.out.println("-------MENU------");
            System.out.println("chào mừng đến với chương trình codegym");
            System.out.println("1 thêm danh sách giảng viên mới");
            System.out.println("2 hiển thị danh sách giảng viên mới");
            System.out.println("3 xóa danh sách giảng viên mới");
            System.out.println("4 tìm kiếm giảng viên theo ID");
            System.out.println("5 thoát");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.displayTeacher();
                    break;
                case 3:
                    iTeacherService.remoTeacher();
                    break;
                case 4:
                    iTeacherService.searchTeacher();
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        }
    }
}
