package functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(12);
        list.add(2);
        list.add(24);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());

        //System.out.println(stream.count());


        list.stream().
                filter(a -> a%2==0).
                forEach(a-> System.out.println(a));
        list.stream().
                filter(a-> a%2==0).
                distinct().
                sorted((a,b) -> b-a).
                forEach(a -> System.out.println(a));

        int sum = list.stream().
                filter(a -> a%2==0).
                distinct().
                map(a -> a+2).
                reduce(1,(a,b)-> a+b);
        System.out.println(sum);

        List<Integer> resList = list.stream().
                filter(a -> a%2 ==0).
                distinct().
                map(a -> a+2).
                collect(Collectors.toList());
        System.out.println(resList);




    }
}
