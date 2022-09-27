package bt_themMvc.service;

import bt_themMvc.model.Student;
import bt_themMvc.until.CheckScore;
import bt_themMvc.until.StudentException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class studentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() {
        Student student = this.inforStudent();
        studentList.add(student);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void remostudet() {
        System.out.println("mời bạn nhập mã học sinh cần xóa");
        int Id = Integer.parseInt(scanner.nextLine());
        boolean flaDeletel = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == Id) {
                System.out.println("bạn có chắc muốn xóa học sinh này k? nhập Y = Yes , N = NO");
                String choise = scanner.nextLine();
                if (choise.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("xóa thành công");
                }
                flaDeletel = true;
                break;
            }
            if (!flaDeletel) {
                System.out.println("không tìm thấy đối tượng");
            }
        }
    }

    @Override
    public void searchStudent() {
        System.out.println("nhập ID học sinh cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i <studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                System.out.println("có trong danh sách"+studentList.get(i));
                check = true;
            }
            }
        if (!check){
            System.out.println("không tìm thấy");
        }

        }
    //                    Collections.swap(studentList,j,j+1);
    @Override
    public void sortStudent() {
        for (int i = 0; i <studentList.size()-1; i++) {
            for (int j = 0; j <studentList.size()-1-i; j++) {
                Student student1 = studentList.get(j);
                Student student2 = studentList.get(j + 1);
                Student temp = studentList.get(j);
                int compare = student1.getLasName().compareTo(student2.getLasName());
                if (compare > 0) {
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
                 if (compare==0){
                    if (student1.getId()-student2.getId()>0){
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }

            }
        }
        System.out.println("sắp xếp thành công");
    }


    public Student inforStudent() {
        System.out.println("mời bạn nhập mã học sinh");
        int Id = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập tên học sinh");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập ngày sinh");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập giới tính học sinh");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("nam")) {
            gender = true;
        } else if (tempGender.equals("nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("mời bạn nhập tên lớp");
        String clas = scanner.nextLine();
       double score ;
        while (true){
           try {
               System.out.println("mời bạn nhập điểm số");
                score = Double.parseDouble(scanner.nextLine());
                CheckScore.falseScore(score);
                break;
           } catch (StudentException|NumberFormatException e) {
               System.out.println(e.getMessage());
           }
        }
        Student student = new Student(Id, name, birth, gender, clas, score);
        return student;
    }

    public static void temp (){
     studentList.add(new Student(4,"người thích học",6,true,"c06",8));
     studentList.add(new Student(2,"kẻ si tình",6,true,"c07",9));
     studentList.add(new Student(7,"chuyện tay ba",6,false,"c08",10));
     studentList.add(new Student(3," Nnguyễn văn an",6,false,"c08",10));
     studentList.add(new Student(1,"  an",6,false,"c08",10));

    }
}
