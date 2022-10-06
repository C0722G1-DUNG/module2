package case_student.service.impl;

import case_student.data.person.CheckEmployee;
import case_student.data.person.CheckPerson;
import case_student.data.person.PersonException;
import case_student.model.modelPerson.Employee;
import case_student.service.IemployeeService;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IemployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void DisplayListEmployees() throws IOException {
        employeeList = redFile();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void AddNewEmployee() throws IOException {
        employeeList = redFile();
        Employee employee = addToLis();
        employeeList.add(employee);
        writeFile(employeeList);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void EditEmployee() throws IOException {
        employeeList = redFile();
        int id;
        while (true) {
            try {
                System.out.println("nhập id của nhân viên cần sửa");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại đang sai định dạng");
            }
        }

        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println("bạn có muốn sửa nhân viên này không ? y = yes , n = no");
                String choise = scanner.nextLine();
                if (choise.equals("y")) {
                    employeeList.set(i, addToLis());
                    check = true;
                    break;
                } else if (choise.equals("n")) {
                    return;
                }
            }
        }
        if (!check) {
            System.out.println("không có trong danh sách");
        }
        writeFile(employeeList);
    }

    public static Employee addToLis() {
        int id;
        while (true) {
            try {
                System.out.println("nhập mã nhân viên( ID nhân viên từ 1-10)");
                id = Integer.parseInt(scanner.nextLine());
                CheckEmployee.checkId(id);
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
                CheckEmployee.checkName(name);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        LocalDate birth;
        while (true) {
            try {
                System.out.println("nhập ngày sinh của nhân viên theo định dạng(dd/MM/yyyy)");
                birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                CheckEmployee.checkBirth(birth);
                break;
            } catch (PersonException | DateTimeParseException e) {
                System.out.println("vui lòng nhập lại ngày sinh đang sai định dạng");
            }
        }
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
        while (true) {
            try {
                System.out.println("nhập số CMND của nhân viên(vui lòng nhập đủ 9 số");
                CMND = scanner.nextLine();
                CheckEmployee.checkCMND(CMND);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        String phone;
        while (true) {
            try {
                System.out.println("nhập số điện thoại của nhân viên(vui lòng nhập đủ 10 số)");
                phone = scanner.nextLine();
                CheckEmployee.checkPhone(phone);
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
                CheckEmployee.checkEmail(email);
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
        double wage;
        while (true) {
            try {
                System.out.println("mức lương của nhân viên, từ 10.000$$->50.000$$");
                wage = Double.parseDouble(scanner.nextLine());
                CheckEmployee.checkWave(wage);
                break;
            } catch (PersonException e) {
                System.out.println("nhập sai định dạng vui lòng nhập lại");
            }
        }
        Employee exception = new Employee(id, name, birth, gender, CMND, phone, email, level, location, wage);
        return exception;
    }

    private  List<Employee> redFile() throws IOException {
        BufferedReader bufferedReader=null;
        List<Employee> employeeList = new ArrayList<>();
        try {
            File file = new File("src\\case_student\\until\\employee.csv");
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String[] info;
            String line;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                employee = new Employee(Integer.parseInt(info[0]), info[1], LocalDate.parse(info[2]), info[3], info[4], info[5], info[6], info[7], info[8], Double.parseDouble(info[9]));
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (bufferedReader!=null){
            bufferedReader.close();
        }
        return employeeList;
    }

    private void writeFile(List<Employee> employeeList) {
        try {
            File file = new File("src\\case_student\\until\\employee.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList) {
                bufferedWriter.write(e.getInfore());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
