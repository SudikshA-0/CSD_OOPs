package lab_4;
//WAP to search for a value in a Tree Map.


import java.util.TreeMap;

public class question5 {
    public static void main(String[] args) {
        TreeMap<Integer , String> treeMap = new TreeMap<>();

        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Mango");
        System.out.println("TreeMap elements: " + treeMap);

        String searchValue = "Mango";

        if (treeMap.containsValue(searchValue)) {
            System.out.println("The value '" + searchValue + "' exists in the TreeMap.");
        } else {
            System.out.println("The value '" + searchValue + "' does not exist in the TreeMap.");
        }
    }



}

