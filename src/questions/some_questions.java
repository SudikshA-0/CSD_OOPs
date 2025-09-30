/* you are given two java list list1 and list2. write the java program that uses linked hashset
 to perform the following operations while preserving insertion order. first operation is union of the unique
elements from both list ...
2 intersection of both lists ....
3 difference:elements in list1 that are
not in list2
*/



package questions;

import java.util.*;

public class some_questions {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        LinkedHashSet<Integer> U= new LinkedHashSet<>(list1);
        U.addAll(list2);

        LinkedHashSet<Integer> I = new LinkedHashSet<>(list1);
        I.retainAll(list2);

        LinkedHashSet<Integer> D = new LinkedHashSet<>(list1);
        D.removeAll(list2);

        System.out.println("list1: "+ list1 + '\n' +"list2: " + list2);
        System.out.println("Union: "+ U);
        System.out.println("Intersection: "+ I);
        System.out.println("Difference: "+D);


    }
}
