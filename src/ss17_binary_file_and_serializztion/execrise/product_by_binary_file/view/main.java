package ss17_binary_file_and_serializztion.execrise.product_by_binary_file.view;

import bt_themMvc.controller.studentController;
import ss17_binary_file_and_serializztion.execrise.product_by_binary_file.controller.ProductController;
import ss17_binary_file_and_serializztion.execrise.product_by_binary_file.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while (true) {

            ProductController.menu();
        }
    }
}