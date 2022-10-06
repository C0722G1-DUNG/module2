package case_student.model.modelPerson;

import java.time.LocalDate;

public abstract class Person  {
    private int id;
    private String name;
    private LocalDate birth;
    private String gender;
    private String CMND;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, LocalDate birth, String gender, String CMND, String phone, String email) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.CMND = CMND;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND=" + CMND +
                ", phone=" + phone +
                ", email='" + email + '\'' ;
    }
}


