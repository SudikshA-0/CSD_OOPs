package lab_4;
//WAP to Demonstrate Iterator

import  java.util.*;


public class question6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("List elements: " + list);


        Iterator<String> it = list.iterator();

        System.out.println("\nIterating through the list using Iterator:");
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }

}
