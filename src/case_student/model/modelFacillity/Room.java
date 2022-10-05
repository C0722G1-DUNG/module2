package case_student.model.modelFacillity;

import case_student.model.modelFacillity.Facility;

public class Room extends Facility {
    private String serviceFreeRoom;

    public Room() {
    }

    public Room(String serviceName, double area, double cost, int maxPeople, String type, String serviceFreeRoom) {
        super(serviceName, area, cost, maxPeople, type);
        this.serviceFreeRoom = serviceFreeRoom;
    }

    public Room(String serviceFreeRoom) {
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
}
