package textFun;

import java.util.*;

public class textComparator implements Comparable<textComparator> {
    private int age ;
    private String name ;

    public textComparator() {
    }

    public textComparator(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(textComparator o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "textComparator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        sắp xếp theo mảng theo thứ tự tăng dần
//        textComparator textComparator1 = new textComparator(23,"DŨNG");
//        textComparator textComparator2 = new textComparator(24,"nam");
//        textComparator textComparator3 = new textComparator(21,"bảo");
//
//        textComparator[] textLis = new textComparator[]{textComparator1,textComparator2,textComparator3};
//        Arrays.sort(textLis);
//        for ( textComparator texts : textLis
//             ) {
//
//            System.out.println(texts);
//        }
        List<String> texLis = new ArrayList<>();
        texLis.add("dũng");
        texLis.add("an");
        texLis.add("bảo");
        texLis.add("đức");

    }
}
