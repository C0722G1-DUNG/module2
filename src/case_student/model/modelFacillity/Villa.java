package case_student.model.modelFacillity;

import case_student.model.modelFacillity.Facility;

public class Villa extends Facility {
    private String roomVilla;
    private int swimmingArea;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double area, double cost, int maxPeople, String type, String roomVilla, int swimmingArea, int floorVilla) {
        super(serviceCode, serviceName, area, cost, maxPeople, type);
        this.roomVilla = roomVilla;
        this.swimmingArea = swimmingArea;
        this.floorVilla = floorVilla;
    }

    public String getRoomVilla() {
        return roomVilla;
    }

    public void setRoomVilla(String roomVilla) {
        this.roomVilla = roomVilla;
    }

    public int getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(int swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
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

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(),this.getServiceName(),this.getArea(),this.getCost(),this.getMaxPeople(),this.getType(),this.getRoomVilla(),this.getSwimmingArea(),this.getFloorVilla());

    }
}
