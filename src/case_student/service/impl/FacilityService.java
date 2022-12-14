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
                System.out.println("M???i b???n nh???p m?? d???ch v??? XX-YYYY, v???i YYYY l?? c??c s??? t??? 0-9,xx l?? t??n vi???t t???t d???ch v???");
                System.out.println("-\tN???u l?? Villa th?? XX s??? l?? VL\n" +
                        "-\tN???u l?? House th?? XX s??? l?? HO\n" +
                        "-\tN???u Room th?? XX s??? l?? RO\n ");
                serviceCode = scanner.nextLine();
                CheckHouse.checkServiceCodeHouse(serviceCode);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i m?? d???ch v??? ??ang sai ?????nh d???ng");
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("T??n d???ch v??? ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                serviceName = scanner.nextLine();
                CheckHouse.checkServiceName(serviceName);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i t??n d???ch v??? ??ang sai ?????nh d???ng");
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Di???n t??ch s??? d???ng ph???i l?? s??? th???c l???n h??n 30m2");
                area = Double.parseDouble(scanner.nextLine());
                CheckHouse.checkAge(area);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui l??ng nh???p l???i di???n t??ch s??? d???ng ??ang sai ?????nh d???ng");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Chi ph?? thu?? ph???i l?? s??? d????ng");
                cost = Double.parseDouble(scanner.nextLine());
                CheckHouse.checkCost(cost);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i chi ph?? thu?? ??ang sai ?????nh d???ng");
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("s??? l?????ng ng?????i thu?? t???i ??a ph???i >0 v?? nh??? h??n <20");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CheckHouse.checkMaxPeople(maxPeople);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i s??? l?????ng ng?????i thu?? ??ang sai ?????nh d???ng");
            }
        }
        String type = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println(" Ki???u thu?? (bao g???m thu?? theo n??m, th??ng, ng??y, gi???)");
                    System.out.println("1. Thu?? theo n??m");
                    System.out.println("2. Thu?? theo th??ng");
                    System.out.println("3. Thu?? theo ng??y");
                    System.out.println("4. Thu?? theo gi???");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            type = "n??m";
                            break abc;
                        case 2:
                            type = "th??ng";
                            break abc;
                        case 3:
                            type = "ng??y";
                            break abc;
                        case 4:
                            type = "gi???";
                            break abc;
                        default:
                            System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
            }
        }
        String roomHouse;
        while (true) {
            try {
                System.out.println("Ti??u chu???n ph??ng vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                roomHouse = scanner.nextLine();
                CheckHouse.checkRoomHouse(roomHouse);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i ti??u chu???n ??ang sai ?????nh d???ng");
            }
        }
        int floorHouse;
        while (true) {
            try {
                System.out.println("S??? t???ng ph???i l?? s??? nguy??n d????ng");
                floorHouse = Integer.parseInt(scanner.nextLine());
                CheckHouse.checkFloorHouse(floorHouse);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui l??ng nh???p s??? t???ng ??ang sai ?????nh d???ng");
            }
        }
        House house = new House(serviceCode, serviceName, area, cost, maxPeople, roomHouse, type, floorHouse);
        return house;
    }

    public static Room addRoom() {
        String serviceCode;
        while (true) {
            try {
                System.out.println("M???i b???n nh???p m?? d???ch v??? XX-YYYY, v???i YYYY l?? c??c s??? t??? 0-9,xx l?? t??n vi???t t???t d???ch v???");
                System.out.println("-\tN???u l?? Villa th?? XX s??? l?? VL\n" +
                        "-\tN???u l?? House th?? XX s??? l?? HO\n" +
                        "-\tN???u Room th?? XX s??? l?? RO\n ");
                serviceCode = scanner.nextLine();
                CHeckRoom.checkServiceCodeRoom(serviceCode);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i m?? d???ch v??? ??ang sai ?????nh d???ng");
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("T??n d???ch v??? ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                serviceName = scanner.nextLine();
                CHeckRoom.checkServiceName(serviceName);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i t??n d???ch v??? ??ang sai ?????nh d???ng");
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Di???n t??ch s??? d???ng ph???i l?? s??? th???c l???n h??n 30m2");
                area = Double.parseDouble(scanner.nextLine());
                CHeckRoom.checkAge(area);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui l??ng nh???p l???i di???n t??ch s??? d???ng ??ang sai ?????nh d???ng");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Chi ph?? thu?? ph???i l?? s??? d????ng");
                cost = Double.parseDouble(scanner.nextLine());
                CHeckRoom.checkCost(cost);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i chi ph?? thu?? ??ang sai ?????nh d???ng");
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("s??? l?????ng ng?????i thu?? t???i ??a ph???i >0 v?? nh??? h??n <20");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CHeckRoom.checkMaxPeople(maxPeople);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i s??t ??ang sai ?????nh d???ng");
            }
        }
        String type = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println(" Ki???u thu?? (bao g???m thu?? theo n??m, th??ng, ng??y, gi???)");
                    System.out.println("1. Thu?? theo n??m");
                    System.out.println("2. Thu?? theo th??ng");
                    System.out.println("3. Thu?? theo ng??y");
                    System.out.println("4. Thu?? theo gi???");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            type = "n??m";
                            break abc;
                        case 2:
                            type = "th??ng";
                            break abc;
                        case 3:
                            type = "ng??y";
                            break abc;
                        case 4:
                            type = "gi???";
                            break abc;
                        default:
                            System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
            }
        }
        System.out.println(" D???ch v??? mi???n ph?? ??i k??m");
        String serviceFreeRoom = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, area, cost, maxPeople, type, serviceFreeRoom);
        return room;
    }

    public static Villa addVilla() {
        String serviceCode;
        while (true) {
            try {
                System.out.println("M???i b???n nh???p m?? d???ch v??? XX-YYYY, v???i YYYY l?? c??c s??? t??? 0-9,xx l?? t??n vi???t t???t d???ch v???");
                System.out.println("-\tN???u l?? Villa th?? XX s??? l?? VL\n" +
                        "-\tN???u l?? House th?? XX s??? l?? HO\n" +
                        "-\tN???u Room th?? XX s??? l?? RO\n ");
                serviceCode = scanner.nextLine();
                CheckVilla.checkServiceCodeVila(serviceCode);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i m?? d???ch v??? ??ang sai ?????nh d???ng");
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("T??n d???ch v??? ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                serviceName = scanner.nextLine();
                CheckVilla.checkServiceName(serviceName);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i t??n d???ch v??? ??ang sai ?????nh d???ng");
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Di???n t??ch s??? d???ng ph???i l?? s??? th???c l???n h??n 30m2");
                area = Double.parseDouble(scanner.nextLine());
                CheckVilla.checkAge(area);
                break;
            } catch (NumberFormatException | facilytyException e) {
                System.out.println("vui l??ng nh???p l???i di???n t??ch s??? d???ng ??ang sai ?????nh d???ng");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Chi ph?? thu?? ph???i l?? s??? d????ng");
                cost = Double.parseDouble(scanner.nextLine());
                CheckVilla.checkCost(cost);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i chi ph?? thu?? ??ang sai ?????nh d???ng");
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("s??? l?????ng ng?????i thu?? t???i ??a ph???i >0 v?? nh??? h??n <20");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CheckVilla.checkMaxPeople(maxPeople);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i s??t ??ang sai ?????nh d???ng");
            }
        }
        String type = null;
        while (true) {
            try {
                abc:
                while (true) {
                    System.out.println(" Ki???u thu?? (bao g???m thu?? theo n??m, th??ng, ng??y, gi???)");
                    System.out.println("1. Thu?? theo n??m");
                    System.out.println("2. Thu?? theo th??ng");
                    System.out.println("3. Thu?? theo ng??y");
                    System.out.println("4. Thu?? theo gi???");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            type = "n??m";
                            break abc;
                        case 2:
                            type = "th??ng";
                            break abc;
                        case 3:
                            type = "ng??y";
                            break abc;
                        case 4:
                            type = "gi???";
                            break abc;
                        default:
                            System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
                            break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
            }
        }
        String roomVilla;
        while (true) {
            try {
                System.out.println("Ti??u chu???n ph??ng ph???i vi???t hoa k?? t??? ?????u, c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                roomVilla = scanner.nextLine();
                CheckVilla.checkRoomVilla(roomVilla);
                break;
            } catch (facilytyException e) {
                System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
            }
        }
        int swimmingArea;
        while (true) {
            try {
                System.out.println("Di???n t??ch h??? b??i ph???i l?? s??? th???c l???n h??n 30m2");
                swimmingArea = Integer.parseInt(scanner.nextLine());
                CheckVilla.checkSwimmingArea(swimmingArea);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
            }
        }
        int floorVilla;
        while (true) {
            try {
                System.out.println("S??? t???ng ph???i l?? s??? nguy??n d????ng");
                floorVilla = Integer.parseInt(scanner.nextLine());
                CheckVilla.checkFloorVilla(floorVilla);
                break;
            } catch (facilytyException | NumberFormatException e) {
                System.out.println("vui l??ng nh???p l???i l???a ch???n, ??ang sai ?????nh d???ng");
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
