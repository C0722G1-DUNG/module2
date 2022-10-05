package case_student.service.impl;

import case_student.model.modelFacillity.Facility;
import case_student.model.modelFacillity.House;
import case_student.model.modelFacillity.Room;
import case_student.model.modelFacillity.Villa;
import case_student.service.IfacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FacilityService implements IfacilityService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void DisplayListFacility() {
        for (Facility key: facilityMap.keySet()) {
            Integer value = facilityMap.get(key);
            System.out.println(key+","+value);
        }
    }
    @Override
    public void AddNewHouse() {
        House house = addHouse();
        facilityMap.put(house, 0);
    }

    @Override
    public void AddNewRoom() {
        Room room = addRoom();
        facilityMap.put(room, 0);
    }

    @Override
    public void AddNewVilla() {
        Villa villa = addVilla();
        facilityMap.put(villa, 0);
    }

    @Override
    public void DisplayListFacilityMaintenance() {

    }

    public static House addHouse() {
        System.out.println("Tên dịch vụ House");
        String serviceName = scanner.nextLine();
        System.out.println("Diện tích sử dụng House");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi phí thuê House");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("số lượng người thuê tối đa của house");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println(" Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)");
        String type = scanner.nextLine();
        System.out.println("Tiêu chuẩn phòng");
        String roomHouse = scanner.nextLine();
        System.out.println("Số tầng");
        int floorHouse = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, area, cost, maxPeople, roomHouse, type, floorHouse);
        return house;
    }

    public static Room addRoom() {
        System.out.println("Tên dịch vụ Room");
        String serviceName = scanner.nextLine();
        System.out.println("Diện tích sử dụng Room");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi phí thuê House");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("số lượng người thuê tối đa của Room");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println(" Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)");
        String type = scanner.nextLine();
        System.out.println(" Dịch vụ miễn phí đi kèm");
        String serviceFreeRoom = scanner.nextLine();
        Room room = new Room(serviceName, area, cost, maxPeople, type, serviceFreeRoom);
        return room;
    }

    public static Villa addVilla() {
        System.out.println("Tên dịch vụ Villa");
        String serviceName = scanner.nextLine();
        System.out.println("Diện tích sử dụng Villa");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi phí thuê Villa");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("số lượng người thuê tối đa của Villa");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println(" Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)");
        String type = scanner.nextLine();
        System.out.println("Tiêu chuẩn phòng");
        String roomVilla = scanner.nextLine();
        System.out.println("Diện tích hồ bơi");
        int swimmingArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Số tầng");
        int floorVilla = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, area, cost, maxPeople, type, roomVilla, swimmingArea, floorVilla);
        return villa;
    }
}
