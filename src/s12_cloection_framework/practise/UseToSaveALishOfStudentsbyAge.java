package s12_cloection_framework.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseToSaveALishOfStudentsbyAge {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap);
    }
}
