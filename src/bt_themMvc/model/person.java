package bt_themMvc.model;

public abstract class person {
private int Id;
private String name;
private int birth;
private Boolean gender;

    public person(int id, String name, int birth, Boolean gender) {
        Id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    public person() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender=" + gender
                ;
    }
}
