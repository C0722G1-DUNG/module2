package bt_themMvc2.model;

public abstract class  Transprot {
    private String seaOfControl;
    private String manufacture;
    private int yearOfmanufacture;
    private String owner;

    public Transprot() {
    }

    public Transprot(String seaOfControl, String manufacture, int yearOfmanufacture, String owner) {
        this.seaOfControl = seaOfControl;
        this.manufacture = manufacture;
        this.yearOfmanufacture = yearOfmanufacture;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYearOfmanufacture() {
        return yearOfmanufacture;
    }

    public void setYearOfmanufacture(int yearOfmanufacture) {
        this.yearOfmanufacture = yearOfmanufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
