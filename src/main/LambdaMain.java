package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaMain {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 1, 3, 5, 7, 10, 4, 9, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 1, 3, 5, 7, 10, 4, 9, 6, 8);

        list1.sort(Integer::compareTo);
        list2.sort(Comparator.reverseOrder());

        System.out.println("Asc: " + list1);
        System.out.println("Desc: " + list2);

        list1.stream()
                .filter(number -> {
                    return number % 2 != 0;
                })
                .forEach(System.out::println);

        list1.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

}
