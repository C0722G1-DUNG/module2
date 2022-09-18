package bt_themMvc.model;

public class Student extends person {
    private String clas;
    private double score;

    public Student(int id, String name, int birth, Boolean gender, String clas, double score) {
        super(id, name, birth, gender);
        this.clas = clas;
        this.score = score;
    }

    public Student() {
    }
    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "clas='" + clas + '\'' +
                ", score=" + score +
                 super.toString()+
                '}';
    }
}
