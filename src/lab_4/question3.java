package lab_4;

//  WAP to add all the elements of a specified to another tree set.

import java.util.*;

public class question3 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Kicchuu");
        set1.add("Kittu");
        set1.add("Tanya");

        System.out.println("TreeSet 1: " + set1);

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Sudiksha");
        set2.add("Sudo");
        set2.add("Sudi");

        System.out.println("TreeSet 2: " + set2);

        set2.addAll(set1);

        System.out.println("TreeSet 2 after adding all elements of TreeSet 1: " + set2);

    }
}
