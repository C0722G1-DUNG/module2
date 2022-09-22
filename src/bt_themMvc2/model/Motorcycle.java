package bt_themMvc2.model;

public class Motorcycle extends Transprot {
    private int wattage;

    public Motorcycle() {
    }

    public Motorcycle(String seaOfControl, String manufacture, int yearOfmanufacture, String owner, int wattage) {
        super(seaOfControl, manufacture, yearOfmanufacture, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
