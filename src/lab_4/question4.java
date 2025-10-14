package lab_4;

import java.util.HashMap;
import java.util.Map;

//WAP to count the number of key-value (size) mappings in a map.
public class question4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        System.out.println("Map elements: " + map);

        int size = map.size();

        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

