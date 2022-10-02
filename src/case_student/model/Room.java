package case_student.model;

public class Room extends ResortFurama {
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
