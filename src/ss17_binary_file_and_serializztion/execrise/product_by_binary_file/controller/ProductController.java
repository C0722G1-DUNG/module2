package ss17_binary_file_and_serializztion.execrise.product_by_binary_file.controller;

import ss17_binary_file_and_serializztion.execrise.product_by_binary_file.service.IproductService;
import ss17_binary_file_and_serializztion.execrise.product_by_binary_file.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
private static IproductService iproductService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menu() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("-------MENU-------");
            System.out.println("chào mừng đến với chương trình codegym");
            System.out.println("1 thêm danh sách san pham");
            System.out.println("2 hiển thị danh sách hs mới");
            System.out.println("3 xóa danh sách hs mới");
            System.out.println("4 tìm kiếm  hs theo ID");
            System.out.println("5 sắp xếp danh sách  hs theo tên , nếu tên giống thì so sánh theo Id");
            System.out.println("6 thoát");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    iproductService.addProduct();
                    break;
                case 2 :
                    iproductService.displayProduct();
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }
}

