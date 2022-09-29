package bt_themMvc.view;

import bt_themMvc.controller.studentController;
import bt_themMvc.controller.teacherController;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("chọn 1 để chỉnh sửa học sinh");
            System.out.println("chọn 2 để chỉnh sửa giảng viên");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1 :

                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
            }

        }
    }
}
