package case_student.service.impl;

import case_student.data.person.CheckPerson;
import case_student.data.person.PersonException;
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
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println("bạn có muốn xửa nhân viên này không ? y = yes , n = no");
                String choise = scanner.nextLine();
                if (choise.equals("y")) {
                    employeeList.set(i, addToLis());
                    check = true;
                    break;
                } else if (choise.equals("n")) {
                    return;
                }
            }
        } if (!check) {
            System.out.println("không có trong danh sách");
        }

    }

    public static Employee addToLis() {
        int id;
        while (true) {
            try {
                System.out.println("nhập mã nhân viên( ID nhân viên từ 1-10)");
                id = Integer.parseInt(scanner.nextLine());
                CheckPerson.checkId(id);
                break;
            } catch (PersonException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại ID đang sai định dạng");
            }
        }
        String name;
        while (true) {
            try {
                System.out.println("nhập tên nhân viên");
                name = scanner.nextLine();
                CheckPerson.checkName(name);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        System.out.println("nhập ngày sinh của nhân viên");
        String birth = scanner.nextLine();
        String gender = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println("nhập giới tính của nhân viên");
                    System.out.println("1. Giới tính nhân viên là: nam");
                    System.out.println("2. Giới tính nhân viên là: nữ");
                    System.out.println("3. Nhân viên là giới tính thứ: 3");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            gender = "nam";
                            break abc;
                        case 2:
                            gender = "nữ";
                            break abc;
                        case 3:
                            gender = "giới tính thứ 3";
                            break abc;
                        default:
                            System.out.println("không hợp lệ vui lòng nhập lại");
                            break;
                    }
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("không hợp lệ vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("không hợp lệ vui lòng nhập lại");
            }
        }

       String CMND;
        while (true){
            try {
                System.out.println("nhập số CMND của nhân viên(vui lòng nhập đủ 9 số");
                 CMND = scanner.nextLine();
                 CheckPerson.checkCMND(CMND);
                 break;
            }catch (PersonException e){
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        String phone;
        while (true) {
            try {
                System.out.println("nhập số điện thoại của nhân viên(vui lòng nhập đủ 10 số)");
                phone = scanner.nextLine();
                CheckPerson.checkPhone(phone);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại sđt đang sai định dạng");
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("nhập email của nhân viên");
                email = scanner.nextLine();
                CheckPerson.checkEmail(email);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại sđt đang sai định dạng");
            }
        }
        String level = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println("trình độ của nhân viên(Trung cấp, Cao đẳng, Đại học và sau đại học)");
                    System.out.println("1.Trình độ nhân viên là: Trung cấp");
                    System.out.println("2.Trình độ nhân viên là: Cao Đẳng");
                    System.out.println("3.Trình độ nhân viên là: Đại Học");
                    System.out.println("4.Trình độ nhân viên là: Sau Đại Học");
                    int choise1 = Integer.parseInt(scanner.nextLine());
                    switch (choise1) {
                        case 1:
                            level = "Trung cấp";
                            break abc;
                        case 2:
                            level = "Cao Đẳng";
                            break abc;
                        case 3:
                            level = "Đại Học";
                            break abc;
                        case 4:
                            level = "Sau Đại Học";
                            break abc;
                        default:
                            System.out.println("nhập sai định dạng vui lòng nhập lại");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("nhập sai định dạng vui lòng nhập lại");
            }
    }
        String location = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println("vị trí của nhân viên(Lễ tân, phục vụ, chuyên viên, giám sát, quản lý,  giám đốc)");
                    System.out.println("1. Vị trí của nhân viên là :Lễ tân");
                    System.out.println("2. Vị trí của nhân viên là :Phục Vụ");
                    System.out.println("3. Vị trí của nhân viên là :Chuyên Viên");
                    System.out.println("4. Vị trí của nhân viên là :Giám sát");
                    System.out.println("5. Vị trí của nhân viên là :Quảng Lý");
                    System.out.println("6. Vị trí của nhân viên là :Giám Đốc");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            location = "Lễ tân";
                            break abc;
                        case 2:
                            location = "Phục Vụ";
                            break abc;
                        case 3:
                            location = "Chuyên Viên";
                            break abc;
                        case 4:
                            location = "Giám sát";
                            break abc;
                        case 5:
                            location = "Quản Lý";
                            break abc;
                        case 6:
                            location = "Giám Đốc";
                            break abc;
                        default:
                            System.out.println("nhập sai định dạng vui lòng nhập lại");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng vui lòng nhập lại");
            }
        }
            System.out.println("mức lương của nhân viên");
            double wage = Double.parseDouble(scanner.nextLine());
            Employee exception = new Employee(id, name, birth, gender, CMND, phone, email, level, location, wage);
            return exception;
        }
}
