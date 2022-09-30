package ss17_binary_file_and_serializztion.execrise.coppy_file_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class coppyBinary implements Serializable {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");


        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("src\\ss17_binary_file_and_serializztion\\execrise\\coppy_file_binary\\data\\source.csv");
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
            objectOutputStream1.writeObject(stringList);
            objectOutputStream1.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_and_serializztion\\execrise\\coppy_file_binary\\data\\source.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (ClassNotFoundException | IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try {
            File targetFile = new File("src\\ss17_binary_file_and_serializztion\\execrise\\coppy_file_binary\\data\\target.csv");
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(stringList);
            for (String s : stringList) {
                System.out.println(s);
            }
            objectOutputStream.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
