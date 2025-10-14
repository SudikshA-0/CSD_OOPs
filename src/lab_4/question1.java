// WAP to iterate a linked list in reverse order.
package lab_4;
import java.util.*;

public class question1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original LinkedList: " + list);

        System.out.println("linkedList in reverse order: ");

        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}








