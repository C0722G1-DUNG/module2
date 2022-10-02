package case_student.model;

public class Villa extends ResortFurama {
    private String roomVilla;
    private int swimmingArea;
    private int floorVilla;

    public Villa() {
    }
    public Villa(String roomVilla, int swimmingArea, int floors) {
        this.roomVilla =roomVilla ;
        this.swimmingArea = swimmingArea;
        this.floorVilla = floors;
    }

    public String getRoomStandard() {
        return getRoomStandard();
    }

    public void setRoomStandard(String roomVilla) {
        this.roomVilla = roomVilla;
    }

    public int getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(int swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getFloors() {
        return floorVilla;
    }

    public void setFloors(int floors) {
        this.floorVilla = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString()+
                "roomStandard='" + roomVilla + '\'' +
                ", swimmingArea=" + swimmingArea +
                ", floors=" + floorVilla +
                '}';
    }
}
