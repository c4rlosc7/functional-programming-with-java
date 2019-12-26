package com.carlos.programming.interfaces.behaviorparameterization;

import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterization {

    public static final Predicate<Integer> INTEGER_PREDICATE_EVEN = x -> x % 2 == 0;
    public static final Predicate<Integer> INTEGER_PREDICATE_ODD = x -> x % 2 != 0;

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        filterAndPrint(numbers, INTEGER_PREDICATE_EVEN);
        filterAndPrint(numbers, INTEGER_PREDICATE_ODD);
    }
}
