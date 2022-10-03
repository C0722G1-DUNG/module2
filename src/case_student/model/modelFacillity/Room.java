package case_student.model.modelFacillity;

import case_student.model.modelFacillity.Facility;

public class Room extends Facility {
    private String serviceFreeRoom;

    public Room() {
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
