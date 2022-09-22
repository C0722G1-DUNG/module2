package bt_themMvc2.model;

public class Car extends Transprot {
    private int numberOfSeats;
    private String vehicalType;

    public Car() {
    }

    public Car(String seaOfControl, String manufacture, int yearOfmanufacture, String owner, int numberOfSeats, String vehicalType) {
        super(seaOfControl, manufacture, yearOfmanufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicalType = vehicalType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(String vehicalType) {
        this.vehicalType = vehicalType;
    }
}
