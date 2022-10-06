package case_student.controller;

import case_student.model.modelPerson.Employee;
import case_student.service.ICustomerService;
import case_student.service.IemployeeService;
import case_student.service.IfacilityService;
import case_student.service.impl.CustomerServiceI;
import case_student.service.impl.EmployeeService;
import case_student.service.impl.FacilityService;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static IemployeeService iemployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerServiceI();
    private static IfacilityService ifacilityService  =new FacilityService();

    public static void displayMainMenu() throws IOException {

        boolean exitMenuParent = false;

        while (true) {
            exitMenuParent = false;


            int choise;
            while (true){
                try {
                    System.out.println("------Chào mừng bạn đến với quản lý Fumar------");
                    System.out.println("1.Quản lý nhân sự");
                    System.out.println("2.Quản lý khách hàng");
                    System.out.println("3.Quản lý cơ sở");
                    System.out.println("4.Quản lý đặt chỗ");
                    System.out.println("5.Quản lý Quảng cáo");
                    System.out.println("6.Exit");
                    System.out.println("---------------------");
                    System.out.println("mời bạn nhập lựa chọn của mình");
                   choise = Integer.parseInt(scanner.nextLine());
                   break;
                }catch (NumberFormatException e){
                    System.out.println("nhập sai định dạng vui lòng nhập lại");
                }catch (Exception e){
                    System.out.println("nhập sai định dạng vui lòng nhập lại");
                }
            }

            switch (choise) {
                case 1:

                    while (true) {
                        System.out.println("--------quản lý nhân sự--------");
                        System.out.println("1.Hiển thị danh sách nhân viên");
                        System.out.println("2.Thêm mới  nhân viên");
                        System.out.println("3.Chỉnh sửa nhân viên");
                        System.out.println("4.Trở lại menu chính");
                        System.out.println("-----------------");
                        int choise1 = Integer.parseInt(scanner.nextLine());
                        switch (choise1) {
                            case 1:
                                iemployeeService.DisplayListEmployees();
                                break;
                            case 2:
                                iemployeeService.AddNewEmployee();
                                break;
                            case 3:
                                iemployeeService.EditEmployee();
                                break;
                            case 4:
                                exitMenuParent = true;
                                break;
                        }

                        if (exitMenuParent) {
                            break;
                        }
                    }

                    break;
                case 2:
                    abc:
                    while (true) {
                        System.out.println("--------Quản lý khách hàng--------");
                        System.out.println("1.Hiển thị danh sách khách hàng");
                        System.out.println("2.Thêm mới khách hàng");
                        System.out.println("3.Chỉnh sửa khách hàng");
                        System.out.println("4.Trở lại menu chính");
                        System.out.println("-----------------");
                        int choise2 = Integer.parseInt(scanner.nextLine());
                        switch (choise2) {
                            case 1:
                                iCustomerService.DisplayListCustomers();
                                break;
                            case 2:
                                iCustomerService.AddNewCustomer();
                                break;
                            case 3:
                                iCustomerService.EditCustomer();
                                break;
                            case 4:
                                break abc;
                        }
                    }
                    break;

                case 3:
                    abc:
                    while (true) {
                        System.out.println("--------Quản lý cơ sở--------");
                        System.out.println("1.Hiển thị danh sách cơ sở");
                        System.out.println("2.Thêm mới  cơ sở");
                        System.out.println("3.Hiển thị danh sách bảo trì cơ sở");
                        System.out.println("4.Trở lại menu chính");
                        System.out.println("-----------------");
                        int choise3 = Integer.parseInt(scanner.nextLine());
                        switch (choise3) {
                            case 1:
                                ifacilityService.displayListFacility();
                                break;
                            case 2:
                                bce:
                                while (true) {
                                    System.out.println("1.Thêm mới cơ sở villa");
                                    System.out.println("2.Thêm mới cơ sở House");
                                    System.out.println("3.Thêm mới cơ sở Room");
                                    System.out.println("4.Trở lại menu quản lý cơ sở");
                                    System.out.println("-----------------");
                                    int choise7 = Integer.parseInt(scanner.nextLine());
                                    switch (choise7) {
                                        case 1:
                                            ifacilityService.addNewVilla();
                                            break ;
                                        case 2:
                                            ifacilityService.addNewHouse();
                                        break;
                                        case 3:
                                            ifacilityService.addNewRoom();
                                            break;
                                        case 4:
                                            break bce;
                                    }
                                }
                                break;
                            case 3:
                                ifacilityService.displayListFacilityMaintenance();
                                break;
                            case 4:
                                break abc;
                        }
                    }

                    break;
                case 4:
                    abc:
                    while (true) {
                        System.out.println("--------Quản lý đặt chỗ-------");
                        System.out.println("1.Hiển thị danh sách đặt chỗ");
                        System.out.println("2.Thêm đặt chỗ mới");
                        System.out.println("3.Tạo hợp đồng mới");
                        System.out.println("4.Hiển thị hợp đồng danh sách");
                        System.out.println("5.Chỉnh sửa hợp đồng");
                        System.out.println("4.Trở lại menu chính");
                        System.out.println("-----------------");
                        int choise4 = Integer.parseInt(scanner.nextLine());
                        switch (choise4) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break abc;
                        }
                    }
                    break;
                case 5:
                    abc:
                    while (true) {
                        System.out.println("--------Quản lý dịch vụ--------");
                        System.out.println("1.Hiển thị danh sách khách hàng sử dụng dịch vụ");
                        System.out.println("2.Hiển thị danh sách khách hàng nhận được voucher");
                        System.out.println("3.Trở lại menu chính");
                        System.out.println("-----------------");
                        int choise5 = Integer.parseInt(scanner.nextLine());
                        switch (choise5) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break abc;
                        }
                    }
                    break;
                case 6:
                    System.exit(6);
            }
        }
    }
}
