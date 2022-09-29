package ss16_Io_Text_File.execrise.date.execrise2.ReadFile.Controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_Io_Text_File\\execrise\\date\\execrise2\\nation.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Country> countryList = new ArrayList<>();
        String lean;
        String[] info;
        Country country;
        while ((lean = bufferedReader.readLine()) != null) {
            info = lean.split(",");
            country = new Country(Integer.parseInt(info[0]),info[1],info[2]);
            countryList.add(country);
        }
        bufferedReader.close();
        for (Country s:countryList) {
            System.out.println(s);
        }
    }
}
