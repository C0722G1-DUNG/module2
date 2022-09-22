package bt_themMvc2.service;

import bt_themMvc2.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements IcarSercive {
    private static Scanner scanner = new Scanner(System.in);
private static   List<Car>carList = new ArrayList<>();
    @Override
    public void addcar() {
        Car car = this.inforCar();
        carList.add(car);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void displaycar() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void remocar() {
        System.out.println("nhập biển kiểm soát cần xóa của phương tiện");
        String seaOfControl = scanner.nextLine();
        boolean falaDelete = false;
        for (int i = 0; i <carList.size(); i++) {
            if (carList.get(i).getSeaOfControl().equals(seaOfControl)){
                System.out.println("bạn muốn xóa phương tiện? Y = yes , N = no");
                String choise = scanner.nextLine();
                if (choise.equals("y") ){
                    carList.remove(i);
                    System.out.println("xóa thành công");
                }
                falaDelete = true;
                break;
            }
            if (!falaDelete){
                System.out.println("không tìm thấy đối tượng");
            }
        }
    }

    @Override
    public void searchcar() {

    }

    public Car inforCar() {
        System.out.println("nhập biển kiểm soát");
        String seaOfControl = scanner.nextLine();
        System.out.println("tên hãng sản xuất");
        String manufacture = scanner.nextLine();
        System.out.println("năm sản xuát");
        int yearOfmanufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("chủ sỡ hữu");
        String owner = scanner.nextLine();
        System.out.println("số chỗ ngồi");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("kểu xe");
        String vehicalType = scanner.nextLine();
        Car car = new Car(seaOfControl, manufacture, yearOfmanufacture, owner, numberOfSeats, vehicalType);
        return car;
    }
}
