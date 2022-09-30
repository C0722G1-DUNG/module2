package ss17_binary_file_and_serializztion.execrise.product_by_binary_file.service;

import java.io.IOException;

public interface IproductService {
    void addProduct() throws IOException, ClassNotFoundException;
    void displayProduct() throws IOException, ClassNotFoundException;
    void removeProduct();
    void sortProduct();

}
