package case_student.model.modelFacillity;

import case_student.model.modelFacillity.Facility;

public class House extends Facility {
    private String roomHouse;
    private int floorHouse;

    public House() {
    }
    public House(String serviceCode, String serviceName, double area, double cost, int maxPeople, String type, String roomHouse, int floorHouse) {
        super(serviceCode, serviceName, area, cost, maxPeople, type);
        this.roomHouse = roomHouse;
        this.floorHouse = floorHouse;
    }
    public String getRoomHouse() {
        return roomHouse;
    }

    public void setRoomHouse(String roomHouse) {
        this.roomHouse = roomHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "roomHouse='" + roomHouse + '\'' +
                ", floorHouse=" + floorHouse +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(),this.getServiceName(),this.getArea(),this.getCost(),this.getMaxPeople(),this.getType(),this.getRoomHouse(),this.getFloorHouse());

    }

}
