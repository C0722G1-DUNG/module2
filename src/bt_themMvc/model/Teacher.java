package bt_themMvc.model;

public class Teacher extends person{
    private String specialize;
    public Teacher(int id, String name, int birth, Boolean gender, String specialize) {
        super(id, name, birth, gender);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "specialize='" + specialize + '\'' +
                super.toString()+
                '}';
    }
    public String getLasNameTeacher() {
        String s = super.getName().trim();
        if (s.indexOf(" ") > 0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        } else {
            return s;
        }
    }
}
