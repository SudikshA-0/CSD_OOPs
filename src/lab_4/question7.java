package lab_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class question7 {
    public static void main(String[] args) {
        Iterable<String> iterable = Arrays.asList("Apple", "Banana", "Cherry", "Mango");


        Collection<String> collection = new ArrayList<>();
        for (String item : iterable) {
            collection.add(item);
        }


        System.out.println("Converted Collection: " + collection);
    }
}
