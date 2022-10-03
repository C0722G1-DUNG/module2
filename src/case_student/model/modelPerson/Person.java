package case_student.model.modelPerson;

public abstract class Person {
    private int id;
    private String name;
    private String birth;
    private String gender;
    private int CMND;
    private int phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String birth, String gender, int CMND, int phone, String email) {
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND=" + CMND +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}


