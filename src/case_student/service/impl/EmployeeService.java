package case_student.service.impl;

import case_student.model.modelPerson.Employee;
import case_student.service.IemployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IemployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void DisplayListEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void AddNewEmployee() {
        Employee employee = addToLis();
        employeeList.add(employee);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void EditEmployee() {
        System.out.println("nhập id của nhân viên cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i <employeeList.size(); i++) {
            if (employeeList.get(i).getId()==id){
                System.out.println("bạn có muốn xóa nhân viên này không ? y = yes , n = no");
                String choise = scanner.nextLine();
                if (choise.equals("y")){
                    employeeList.remove(i);
                    System.out.println("xóa thành công");
                }
                check=true;
                break;
            }
            System.out.println("không có trong danh sách");
        }

    }

    public static Employee addToLis() {
        System.out.println("nhập mã nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh của nhân viên");
        String birth = scanner.nextLine();
        System.out.println("nhập giới tính của nhân viên");
        String gender = scanner.nextLine();
        System.out.println("nhập số CMND của nhân viên");
        int CMND = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số điện thoại của nhân viên");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập email của nhân viên");
        String email = scanner.nextLine();
        System.out.println("trình độ của nhân viên");
        String level = scanner.nextLine();
        System.out.println("vị trí của nhân viên");
        String location = scanner.nextLine();
        System.out.println("mức lương của nhân viên");
        double wage = Double.parseDouble(scanner.nextLine());
        Employee exception = new Employee(id, name, birth, gender, CMND, phone, email, level, location, wage);
        return exception;
    }
    public  static  void lisTemp(){
        Employee employee = new Employee(1,"dũng","06/12/2002","nam",123456,12,"dung@","giỏi","12323",10.0);
        employeeList.add(employee);
    }
}
