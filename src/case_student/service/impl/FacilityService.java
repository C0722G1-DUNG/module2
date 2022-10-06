package case_student.service.impl;

import case_student.data.facility.CHeckRoom;
import case_student.data.facility.CheckHouse;
import case_student.data.facility.CheckVilla;
import case_student.data.facility.facilytyException;
import case_student.model.modelFacillity.Facility;
import case_student.model.modelFacillity.House;
import case_student.model.modelFacillity.Room;
import case_student.model.modelFacillity.Villa;
import case_student.service.IfacilityService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FacilityService implements IfacilityService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayListFacility() throws IOException {
        houseMap =reedFileHouse();
        for (House key : houseMap.keySet()){
            Integer value = houseMap.get(key);
            System.out.println(key+","+value);
        }
//        for (Facility key : facilityMap.keySet()) {
//            Integer value = facilityMap.get(key);
//            System.out.println(key + "," + value);
//        }
    }

    @Override
    public void addNewHouse() throws IOException {
        houseMap = reedFileHouse();
        House house = addHouse();
        houseMap.put(house, 0);
        writeFileHouse(houseMap);
    }

    @Override
    public void addNewRoom() {
        Room room = addRoom();
        facilityMap.put(room, 0);
    }

    @Override
    public void addNewVilla() {
        Villa villa = addVilla();
        facilityMap.put(villa, 0);
    }

    @Override
    public void displayListFacilityMaintenance() {

    }

    public static House addHouse() {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Mời bạn nhập mã dịch vụ XX-YYYY, với YYYY là các số từ 0-9,xx là tên viết tắt dịch vụ");
                System.out.println("-\tNếu là Villa thì XX sẽ là VL\n" +
                        "-\tNếu là House thì XX sẽ là HO\n" +
                        "-\tNếu Room thì XX sẽ là RO\n ");
                serviceCode = scanner.nextLine();
                CheckHouse.checkServiceCodeHouse(serviceCode);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại mã dịch vụ đang sai định dạng");
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                serviceName = scanner.nextLine();
                CheckHouse.checkServiceName(serviceName);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại tên dịch vụ đang sai định dạng");
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Diện tích sử dụng phải là số thực lớn hơn 30m2");
                area = Double.parseDouble(scanner.nextLine());
                CheckHouse.checkAge(area);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui lòng nhập lại diện tích sử dụng đang sai định dạng");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Chi phí thuê phải là số dương");
                cost = Double.parseDouble(scanner.nextLine());
                CheckHouse.checkCost(cost);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại chi phí thuê đang sai định dạng");
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("số lượng người thuê tối đa phải >0 và nhỏ hơn <20");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CheckHouse.checkMaxPeople(maxPeople);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại số lượng người thuê đang sai định dạng");
            }
        }
        String type = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println(" Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)");
                    System.out.println("1. Thuê theo năm");
                    System.out.println("2. Thuê theo tháng");
                    System.out.println("3. Thuê theo ngày");
                    System.out.println("4. Thuê theo giờ");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            type = "năm";
                            break abc;
                        case 2:
                            type = "tháng";
                            break abc;
                        case 3:
                            type = "ngày";
                            break abc;
                        case 4:
                            type = "giờ";
                            break abc;
                        default:
                            System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
            }
        }
        String roomHouse;
        while (true) {
            try {
                System.out.println("Tiêu chuẩn phòng viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                roomHouse = scanner.nextLine();
                CheckHouse.checkRoomHouse(roomHouse);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại tiêu chuẩn đang sai định dạng");
            }
        }
        int floorHouse;
        while (true) {
            try {
                System.out.println("Số tầng phải là số nguyên dương");
                floorHouse = Integer.parseInt(scanner.nextLine());
                CheckHouse.checkFloorHouse(floorHouse);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui lòng nhập số tầng đang sai định dạng");
            }
        }
        House house = new House(serviceCode, serviceName, area, cost, maxPeople, roomHouse, type, floorHouse);
        return house;
    }

    public static Room addRoom() {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Mời bạn nhập mã dịch vụ XX-YYYY, với YYYY là các số từ 0-9,xx là tên viết tắt dịch vụ");
                System.out.println("-\tNếu là Villa thì XX sẽ là VL\n" +
                        "-\tNếu là House thì XX sẽ là HO\n" +
                        "-\tNếu Room thì XX sẽ là RO\n ");
                serviceCode = scanner.nextLine();
                CHeckRoom.checkServiceCodeRoom(serviceCode);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại mã dịch vụ đang sai định dạng");
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                serviceName = scanner.nextLine();
                CHeckRoom.checkServiceName(serviceName);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại tên dịch vụ đang sai định dạng");
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Diện tích sử dụng phải là số thực lớn hơn 30m2");
                area = Double.parseDouble(scanner.nextLine());
                CHeckRoom.checkAge(area);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui lòng nhập lại diện tích sử dụng đang sai định dạng");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Chi phí thuê phải là số dương");
                cost = Double.parseDouble(scanner.nextLine());
                CHeckRoom.checkCost(cost);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại chi phí thuê đang sai định dạng");
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("số lượng người thuê tối đa phải >0 và nhỏ hơn <20");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CHeckRoom.checkMaxPeople(maxPeople);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại sđt đang sai định dạng");
            }
        }
        String type = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println(" Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)");
                    System.out.println("1. Thuê theo năm");
                    System.out.println("2. Thuê theo tháng");
                    System.out.println("3. Thuê theo ngày");
                    System.out.println("4. Thuê theo giờ");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            type = "năm";
                            break abc;
                        case 2:
                            type = "tháng";
                            break abc;
                        case 3:
                            type = "ngày";
                            break abc;
                        case 4:
                            type = "giờ";
                            break abc;
                        default:
                            System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
            }
        }
        System.out.println(" Dịch vụ miễn phí đi kèm");
        String serviceFreeRoom = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, area, cost, maxPeople, type, serviceFreeRoom);
        return room;
    }

    public static Villa addVilla() {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Mời bạn nhập mã dịch vụ XX-YYYY, với YYYY là các số từ 0-9,xx là tên viết tắt dịch vụ");
                System.out.println("-\tNếu là Villa thì XX sẽ là VL\n" +
                        "-\tNếu là House thì XX sẽ là HO\n" +
                        "-\tNếu Room thì XX sẽ là RO\n ");
                serviceCode = scanner.nextLine();
                CheckVilla.checkServiceCodeVila(serviceCode);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại mã dịch vụ đang sai định dạng");
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                serviceName = scanner.nextLine();
                CheckVilla.checkServiceName(serviceName);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại tên dịch vụ đang sai định dạng");
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Diện tích sử dụng phải là số thực lớn hơn 30m2");
                area = Double.parseDouble(scanner.nextLine());
                CheckVilla.checkAge(area);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui lòng nhập lại diện tích sử dụng đang sai định dạng");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Chi phí thuê phải là số dương");
                cost = Double.parseDouble(scanner.nextLine());
                CheckVilla.checkCost(cost);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại chi phí thuê đang sai định dạng");
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("số lượng người thuê tối đa phải >0 và nhỏ hơn <20");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CheckVilla.checkMaxPeople(maxPeople);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại sđt đang sai định dạng");
            }
        }
        String type = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println(" Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ)");
                    System.out.println("1. Thuê theo năm");
                    System.out.println("2. Thuê theo tháng");
                    System.out.println("3. Thuê theo ngày");
                    System.out.println("4. Thuê theo giờ");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            type = "năm";
                            break abc;
                        case 2:
                            type = "tháng";
                            break abc;
                        case 3:
                            type = "ngày";
                            break abc;
                        case 4:
                            type = "giờ";
                            break abc;
                        default:
                            System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
            }
        }
        String roomVilla;
        while (true) {
            try {
                System.out.println("Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                roomVilla = scanner.nextLine();
                CheckVilla.checkRoomVilla(roomVilla);
                break;
            } catch (facilytyException e) {
                System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
            }
        }
        int swimmingArea;
        while (true) {
            try {
                System.out.println("Diện tích hồ bơi phải là số thực lớn hơn 30m2");
                swimmingArea = Integer.parseInt(scanner.nextLine());
                CheckVilla.checkSwimmingArea(swimmingArea);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
            }
        }
        int floorVilla;
        while (true) {
            try {
                System.out.println("Số tầng phải là số nguyên dương");
                floorVilla = Integer.parseInt(scanner.nextLine());
                CheckVilla.checkFloorVilla(floorVilla);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui lòng nhập lại lựa chọn, đang sai định dạng");
            }
        }
        Villa villa = new Villa(serviceCode, serviceName, area, cost, maxPeople, type, roomVilla, swimmingArea, floorVilla);
        return villa;
    }

    public Map<House, Integer> reedFileHouse() throws IOException {
        BufferedReader bufferedReader = null;
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        try {
            File file = new File("src\\case_student\\until\\house.csv");
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String[] info;
            String line;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                house = new House();
                house.setServiceCode(info[0]);
                house.setServiceName(info[1]);
                house.setArea(Double.parseDouble(info[2]));
                house.setCost(Double.parseDouble(info[3]));
                house.setMaxPeople(Integer.parseInt(info[4]));
                house.setType(info[5]);
                house.setRoomHouse(info[6]);
                house.setFloorHouse(Integer.parseInt(info[7]));
                houseMap.put(house,0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader!=null){
            bufferedReader.close();
        }
        return  houseMap;
    }
    public void writeFileHouse(Map<House,Integer> houseMap){
        try {
            File file = new File("src\\case_student\\until\\house.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House house:houseMap.keySet()){
                bufferedWriter.write(house.getInfo());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
