package collection;
import java.util.ArrayList;
import java.util.Scanner;


public class AI {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Sudiksha");
        list.add(true);
        list.add(12.5);
        System.out.println(list);
//
//        for(Object i : list){
//            System.out.println(i);
//        }
//
        ArrayList list1 = new ArrayList();
        list1.add(11);
        list1.add(0,122);
        list1.add(list);
            System.out.println(list1);

            list1.addAll(list);
        System.out.println(list1);

//        for(int i = 0; i <list.size(); i++)
//        {
//            System.out.println(list.get(i));
//
//        }
    }


}
