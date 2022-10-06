package case_student.model.modelFacillity;

import case_student.model.modelFacillity.Facility;

public class Room extends Facility {
    private String serviceFreeRoom;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double area, double cost, int maxPeople, String type, String serviceFreeRoom) {
        super(serviceCode, serviceName, area, cost, maxPeople, type);
        this.serviceFreeRoom = serviceFreeRoom;
    }
    public String getServiceFreeRoom() {
        return serviceFreeRoom;
    }

    public void setServiceFreeRoom(String serviceFreeRoom) {
        this.serviceFreeRoom = serviceFreeRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+
                "serviceFreeRoom='" + serviceFreeRoom + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(),this.getServiceName(),this.getArea(),this.getCost(),this.getMaxPeople(),this.getType(),this.getServiceFreeRoom());

    }
}
