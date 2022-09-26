package bt_themMvc.controller;

import bt_themMvc.model.Student;
import bt_themMvc.service.IStudentService;
import bt_themMvc.service.studentService;

import java.util.Scanner;

public class studentController {
    private static IStudentService iStudentService = new studentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        studentService.temp();
        while (true) {
            System.out.println("-------MENU-------");
            System.out.println("chào mừng đến với chương trình codegym");
            System.out.println("1 thêm danh sách hs mới");
            System.out.println("2 hiển thị danh sách hs mới");
            System.out.println("3 xóa danh sách hs mới");
            System.out.println("4 tìm kiếm  hs theo ID");
            System.out.println("5 sắp xếp danh sách  hs theo tên , nếu tên giống thì so sánh theo Id");
            System.out.println("6 thoát");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayStudent();
                    break;
                case 3:
                    iStudentService.remostudet();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
                case 5 :
                    iStudentService.sortStudent();
                    break;
                    case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
