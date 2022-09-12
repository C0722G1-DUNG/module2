package ss5_access_modifier.practise;

public class Text1 {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Text1(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
 class TestStaticMethod {
    public static void main(String args[]) {


        //creating objects
        Text1 s1 = new Text1(111, "Hoang");
        Text1 s2 = new Text1(222, "Khanh");
        Text1 s3 = new Text1(333, "Nam");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
        Text1.change(); //calling change method
    }

}

