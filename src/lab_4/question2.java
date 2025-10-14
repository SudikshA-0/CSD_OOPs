//2.     WAP to append the specified element to the end of a hash set.

package lab_4;
import java.util.*;

public class question2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("Pink");
        set.add("Black");

        System.out.println("Original HashSet: "+ set);

        set.add("Yellow");

        System.out.println("Hash after apending: "+ set);
    }

}
