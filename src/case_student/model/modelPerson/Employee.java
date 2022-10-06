package case_student.model.modelPerson;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;
    private String location;
    private double wage;

    public Employee() {
    }

    public Employee(int id, String name, LocalDate birth, String gender, String CMND, String phone, String email, String level, String location, double wage) {
        super(id, name, birth, gender, CMND, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee"+
                super.toString()+
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage ;
    }
    public String getInfore(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getBirth(),this.getGender(),this.getCMND(),this.getPhone(),this.getEmail(),this.getLevel(),this.location,this.getWage());
    }
}
