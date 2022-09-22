package bt_themMvc2.model;

public class Truck extends Transprot {
    private int tonnage;

    public Truck() {
    }

    public Truck(String seaOfControl, String manufacture, int yearOfmanufacture, String owner, int tonnage) {
        super(seaOfControl, manufacture, yearOfmanufacture, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
}
