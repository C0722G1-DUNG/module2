package bt_themMvc.service;

import bt_themMvc.model.Student;
import bt_themMvc.model.Teacher;
import ss10.execrise.TestMylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teacherService implements ITeacherService {
    private static Scanner scanner =new Scanner(System.in);
    private  static List<Teacher> teacherList= new ArrayList<>();
    @Override
    public void addTeacher() {
        Teacher teacher= this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void displayTeacher() {
for (Teacher teacher :teacherList){
    System.out.println(teacher);
}
    }

    @Override
    public void remoTeacher() {
        System.out.println("giảng viên cần xóa là");
int Id = Integer.parseInt(scanner.nextLine());
boolean remetrue = false ;

        for (int i = 0; i <teacherList.size(); i++) {
            if (teacherList.get(i).getId()==Id){
                System.out.println("bạn có muốn xóa giảng viên này không?  Y = yes , N= no");
                String choise = scanner.nextLine();
                if (choise.equals("Y")){
                teacherList.remove(i);
                System.out.println("xóa thành công");
            }
            remetrue = true;
            break;
        }
        if (!remetrue){
            System.out.println("giảng viên không có trong danh sách");
        }
        }
    }

    @Override
    public void searchTeacher() {
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <teacherList.size(); i++) {
            if (teacherList.get(i).getId()==id){
                System.out.println(teacherList.get(i));
            }
        }
    }

    public Teacher infoTeacher(){
        System.out.println("nhập mã giảng viên");
        int Id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên giảng viên");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh giảng viên");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giới tính giảng viên");
        Boolean gender;
        String testgender=scanner.nextLine() ;
        if (testgender.equals("nam")){
            gender =true;
        }
        else if (testgender.equals("nữ")){
            gender =false;
        }
        else {
             gender = null;
        }
        System.out.println("nhập chuyên môn giảng viên");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(Id,name,birth,gender,specialize);
        return teacher;
    }
}
