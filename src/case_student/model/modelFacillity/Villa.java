package case_student.model.modelFacillity;

import case_student.model.modelFacillity.Facility;

public class Villa extends Facility {
    private String roomVilla;
    private int swimmingArea;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String serviceName, double area, double cost, int maxPeople, String type, String roomVilla, int swimmingArea, int floorVilla) {
        super(serviceName, area, cost, maxPeople, type);
        this.roomVilla = roomVilla;
        this.swimmingArea = swimmingArea;
        this.floorVilla = floorVilla;
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
