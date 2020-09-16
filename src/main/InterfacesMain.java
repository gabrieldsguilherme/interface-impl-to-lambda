package main;

import implementation.AscComparator;
import implementation.DescComparator;
import implementation.OddPredicate;
import implementation.PrintConsumer;

import java.util.Arrays;
import java.util.List;

public class InterfacesMain {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 1, 3, 5, 7, 10, 4, 9, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 1, 3, 5, 7, 10, 4, 9, 6, 8);

        list1.sort(new AscComparator());
        list2.sort(new DescComparator());

        System.out.println("Asc: " + list1);
        System.out.println("Desc: " + list2);

        list1.stream()
                .filter(new OddPredicate())
                .forEach(new PrintConsumer());
    }

}
