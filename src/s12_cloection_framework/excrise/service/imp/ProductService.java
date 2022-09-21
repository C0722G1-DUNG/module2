package s12_cloection_framework.excrise.service.imp;

import s12_cloection_framework.excrise.model.Product;
import s12_cloection_framework.excrise.service.IproductService;

import java.util.*;

public class ProductService implements IproductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();
public static void test(){
    Product product1 =new Product(1,"bánh",10);
    Product product2 =new Product(2,"nước",11);
    Product product3 =new Product(3,"kẹo",12);
    products.add(product1);
    products.add(product2);
    products.add(product3);
}
    @Override
    public void add() {
        Product product = this.infoProduct();
        products.add(product);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void editById() {
        System.out.println("nhập id cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean falDelete = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("bạn có muốn sửa lại sản phẩm? Y = yes , N = no");
                String choise = scanner.nextLine();
                if (choise.equals("Y")) {
                    System.out.println("nhập tên sản phẩm cần sửa");
                    String name = scanner.nextLine();
                    products.get(i).setName(name);
                    System.out.println("nhập giá sản phẩm cần sửa");
                    int price = Integer.parseInt(scanner.nextLine());
                    products.get(i).setPrice(price);
                    System.out.println("sửa theo id thành công");
                }
                falDelete = true;
                break;
            }
            if (!falDelete) {
                System.out.println("không tìm thấy đối tượng");
            }
        }

    }


    @Override
    public void removeById() {
        System.out.println("nhập mã sản phẩm cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        Boolean falDelete = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("bạn có muốn xóa ? Y= yes , N = no");
                String choise = scanner.nextLine();
                if (choise.equals("Y")) {
                    products.remove(i);
                    System.out.println("xóa thành công");
                }
                falDelete = true;
                break;
            }
            if (!falDelete) {
                System.out.println("không tìm thấy đối tượng");
            }
        }
    }

    @Override
    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void searchByName() {
        System.out.println("nhập tên sản phầm cần tìm trong danh sách");
        String name = scanner.nextLine();
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                System.out.println("có trong danh sách tìm kiếm"+products.get(i));
            }
        }
    }

    @Override
    public void sorts() {
        System.out.println("Sau khi sắp xếp giảm dần!");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        this.display();
    }

    public Product infoProduct() {
        System.out.println("nhập mã sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }

}
