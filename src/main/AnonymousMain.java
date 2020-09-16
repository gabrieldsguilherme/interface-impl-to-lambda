package main;

import implementation.AscComparator;
import implementation.DescComparator;
import implementation.OddPredicate;
import implementation.PrintConsumer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AnonymousMain {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 1, 3, 5, 7, 10, 4, 9, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 1, 3, 5, 7, 10, 4, 9, 6, 8);

        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n1.compareTo(n2);
            }
        });
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1);
            }
        });

        System.out.println("Asc: " + list1);
        System.out.println("Desc: " + list2);

        list1.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer number) {
                        return number % 2 != 0;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer number) {
                        System.out.println(number);
                    }
                });
    }

}
