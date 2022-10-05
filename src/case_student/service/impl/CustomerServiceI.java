package case_student.service.impl;

import case_student.data.person.CheckPerson;
import case_student.data.person.PersonException;
import case_student.model.modelPerson.Customer;
import case_student.service.ICustomerService;
import ss10.execrise.TestMylist;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceI implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private List<Customer> customerList = new LinkedList<>();

    @Override
    public void DisplayListCustomers() throws IOException {
        customerList = readFile();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void AddNewCustomer() throws IOException {
        customerList = readFile();
        Customer customer = addToCustomer();
        customerList.add(customer);
        write(customerList);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void EditCustomer() throws IOException {
        customerList = readFile();
        System.out.println("mời bạn nhập id của khách hàng cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("bạn có muốn sửa khách hàng này không ? y=YES , n = NO");
                String choise = scanner.nextLine();
                if (choise.equals("y")) {
                    customerList.set(i, addToCustomer());
                    check = true;
                    break;
                } else if (choise.equals("n")) {
                    return;
                }
            }
        }
        if (!check) {
            System.out.println("không tìm thấy trong danh sách");
        }
        write(customerList);
    }

    public static Customer addToCustomer() {
        int id;
        while (true) {
            try {
                System.out.println("nhập mã khách từ 1-10");
                id = Integer.parseInt(scanner.nextLine());
                CheckPerson.checkId(id);
                break;
            } catch (NumberFormatException | PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        String name;
        while (true) {
            try {
                System.out.println("nhập tên khách");
                name = scanner.nextLine();
                CheckPerson.checkName(name);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        System.out.println("nhập ngày sinh của khách");
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
        while (true) {
            try {
                System.out.println("nhập số CMND của nhân viên(vui lòng nhập đủ 9 số");
                CMND = scanner.nextLine();
                CheckPerson.checkCMND(CMND);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        String phone;
        while (true) {
            try {
                System.out.println("nhập số điện thoại của khách(Bắt đầu từ 0 ,và có tổng cộng 10 số)");
                phone = scanner.nextLine();
                CheckPerson.checkPhone(phone);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("nhập email của khách");
                email = scanner.nextLine();
                CheckPerson.checkEmail(email);
                break;
            } catch (PersonException e) {
                System.out.println("vui lòng nhập lại name đang sai định dạng");
            }
        }
        String typeCustomer = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println("nhập vào cấp độ của khách(Diamond, Platinium, Gold, Silver, Member).");
                    System.out.println("1. Cấp độ của khách hàng là : Diamond");
                    System.out.println("2. Cấp độ của khách hàng là : Platinum");
                    System.out.println("3. Cấp độ của khách hàng là : Gold");
                    System.out.println("4. Cấp độ của khách hàng là : Silver");
                    System.out.println("5. Cấp độ của khách hàng là : Member");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            typeCustomer = "Diamond";
                            break abc;
                        case 2:
                            typeCustomer = "Platium";
                            break abc;
                        case 3:
                            typeCustomer = "Gold";
                            break abc;
                        case 4:
                            typeCustomer = "Silver";
                            break abc;
                        case 5:
                            typeCustomer = "Member";
                            break abc;
                        default:
                            System.out.println("vui lòng chọn đúng , bạn đã sai định dạng");
                            break;
                    }
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("nhập vào địa chỉ của khách");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, birth, gender, CMND, phone, email, typeCustomer, address);
        return customer;
    }

    public static List<Customer> readFile() throws IOException {
        File file = new File("src\\case_student\\until\\customer.csv");
        List<Customer> customers = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lean;
        String[] info;
        Customer customer;
        while ((lean = bufferedReader.readLine()) != null) {
            info = lean.split(",");
            customer = new Customer(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]);
            customers.add(customer);
        }
        bufferedReader.close();
        return customers;
    }
    public static void write(List<Customer> customers) throws IOException {
        File file = new File("src\\case_student\\until\\customer.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer c:customers) {
            bufferedWriter.write(c.getINfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

