package ss16_Io_Text_File.execrise.date.execrise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public static void main(String[] args) {
        List<Character> numberChar = new ArrayList<>();
        try {
            File inFile = new File("src\\ss16_Io_Text_File\\execrise\\date\\source.csv.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader read = new BufferedReader(fileReader);
            String line ;
            File outFile = new File("src\\ss16_Io_Text_File\\execrise\\date\\target.txt");
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            while ((line = read.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        numberChar.add(line.charAt(i));
                    }
                }
            }
            for (Character character:numberChar) {
                System.out.println(character);
            }
            read.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("file không tồn tại ,sai vui lòng nhập lại");
        }
    }
}
