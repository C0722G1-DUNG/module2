package textFun;

import java.util.Scanner;

public class textNotFun {
    private String name;

    public textNotFun(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "textNotFun{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name.split(" ");
       textNotFun text = new textNotFun(name);
        System.out.println(text);
    }
}
