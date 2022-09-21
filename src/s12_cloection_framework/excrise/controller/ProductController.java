package s12_cloection_framework.excrise.controller;

import s12_cloection_framework.excrise.model.Product;
import s12_cloection_framework.excrise.service.IproductService;
import s12_cloection_framework.excrise.service.imp.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);

    private static IproductService iproducts =new ProductService();

    public static void menuProduct() {
        ProductService.test();
        while (true){
        System.out.println("menu thay đổi sản phẩm");
        System.out.println("1.thêm sản phẩm");
        System.out.println("2.sửa thông tin sản phẩm theo Id");
        System.out.println("3.xóa sản phẩm theo id");
        System.out.println("4.hiển thị danh sách sản phẩm");
        System.out.println("5.tìm kiếm sản phẩm theo tên");
        System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7.thoát");
        System.out.println("_______________");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise){
            case 1 :
                iproducts.add();
                break;
            case 2 :
                iproducts.editById();
                break;
            case 3:
                iproducts.removeById();
                break;
            case 4:
                iproducts.display();
                break;
            case 5:
                iproducts.searchByName();
                break;
            case 6:
                iproducts.sorts();
                break;
            case 7:
                System.exit(7);
                break;

        }
    }
}
}
