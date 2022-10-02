package case_student.model;

public class House extends ResortFurama {
    private String roomHouse;
    private int floorHouse;

    public House() {
    }

    public House(String roomHouse, int floorHouse) {
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
}
