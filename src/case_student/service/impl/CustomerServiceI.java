package case_student.service.impl;

import case_student.model.modelPerson.Customer;
import case_student.service.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceI implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private List<Customer> customerList = new LinkedList<>();

    @Override
    public void DisplayListCustomers() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void AddNewCustomer() {
        Customer customer = addToCustomer();
        customerList.add(customer);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void EditCustomer() {
        System.out.println("mời bạn nhập id của khách hàng cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i <customerList.size(); i++) {
            if (customerList.get(i).getId()==id){
                System.out.println("bạn có muốn xóa khách hàng này không ? y=YES , n = NO");
                String choise = scanner.nextLine();
                if (choise.equals("y")){
                    customerList.remove(i);
                }
                check=true;
                break;

            }
            System.out.println("không có trong danh sách");
        }
    }

    public static Customer addToCustomer() {
        System.out.println("nhập mã khách");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên khách");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh của khách");
        String birth = scanner.nextLine();
        System.out.println("nhập giới tính của khách");
        String gender = scanner.nextLine();
        System.out.println("nhập số CMND của khách");
        int CMND = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số điện thoại của khách");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập email của khách");
        String email = scanner.nextLine();
        System.out.println("nhập vào cấp độ của khách");
        String typeCustomer = scanner.nextLine();
        System.out.println("nhập vào địa chỉ của khách");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, birth, gender, CMND, phone, email, typeCustomer, address);
        return customer;
    }
}
