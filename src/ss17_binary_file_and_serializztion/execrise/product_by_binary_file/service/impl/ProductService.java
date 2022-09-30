package ss17_binary_file_and_serializztion.execrise.product_by_binary_file.service.impl;

import bt_themMvc.model.Student;
import ss17_binary_file_and_serializztion.execrise.product_by_binary_file.model.Product;
import ss17_binary_file_and_serializztion.execrise.product_by_binary_file.service.IproductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IproductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() throws IOException, ClassNotFoundException {
        Product product = firsAddProduct();
        productList.add(product);
        System.out.println("thêm mới thành công");
        writeFile(productList);

    }

    @Override
    public void displayProduct() throws IOException, ClassNotFoundException {
        productList = readFile();
        for (Product s:productList) {
            System.out.println(s.toString());
        }
    }

    @Override
    public void removeProduct() {

    }

    @Override
    public void sortProduct() {

    }

    public static Product firsAddProduct() {
        System.out.println("nhập mã sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, manufacturer, price);
        return product;
    }
    private List<Product> readFile() throws IOException, ClassNotFoundException {
        List<Product> productList = null;
        try {
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_and_serializztion\\execrise\\product_by_binary_file\\data\\product.txt");



            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println("không có dữ liệu");
        }
        return productList;
    }
    private static void writeFile(List<Product> productList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_and_serializztion\\execrise\\product_by_binary_file\\data\\product.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productList);
        objectOutputStream.close();
    }
}
