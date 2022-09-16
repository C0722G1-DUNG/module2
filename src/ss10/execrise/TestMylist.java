package ss10.execrise;

import ss5_access_modifier.exercise_study.Student;

public class TestMylist {
    public static class Studen{
    private int ID;
    private String name;

        public Studen(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }

        public Studen() {
        }

        public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    }

    public static void main(String[] args) {
Studen a = new Studen(1,"dũng");
Studen b = new Studen(1,"dũng");
Studen c = new Studen(1,"dũng");
Studen d = new Studen(1,"dũng");
Studen e = new Studen(1,"dũng2");
Mylist<Studen>studenMylist= new Mylist<>();
studenMylist.add(a);
studenMylist.add(b);
studenMylist.add(c);
studenMylist.add(d);
studenMylist.add(e,2);
for (int i=0;i<studenMylist.size();i++){
Studen studen =(Studen) studenMylist.elements[i];
    System.out.println(studen.getID());
    System.out.println(studen.getName());
}
    }
}
