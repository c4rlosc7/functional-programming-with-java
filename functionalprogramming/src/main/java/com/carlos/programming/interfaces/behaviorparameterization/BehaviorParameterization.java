package com.carlos.programming.interfaces.behaviorparameterization;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviorParameterization {

    public static final Predicate<Integer> INTEGER_PREDICATE_EVEN = x -> x % 2 == 0;
    public static final Predicate<Integer> INTEGER_PREDICATE_ODD = x -> x % 2 != 0;

    public static final Function<Integer, Integer> INTEGER_INTEGER_FUNCTION = x -> x * x;
    public static final Function<Integer, Integer> INTEGER_INTEGER_F_CUBED = x -> x * x * x;
    public static final Function<Integer, Integer> INTEGER_INTEGER_F_DOUBLE = x -> x + x;

    public static final Function<Integer, String> INTEGER_STRING_FUNCTION = x -> x + " using input INTEGER and output STRING";

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    private static List<Integer> mapandcreatenewlistInteger(List<Integer> numbers, Function<Integer, Integer> function,
                                                            String nameList) {
        System.out.println(nameList);
        return numbers.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    private static List<String> mapandcreatenewlistString(List<Integer> numbers) {
        return numbers.stream()
                .map(INTEGER_STRING_FUNCTION)
                .collect(Collectors.toList());
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println("Using Predicate");
        filterAndPrint(numbers, INTEGER_PREDICATE_EVEN);
        filterAndPrint(numbers, INTEGER_PREDICATE_ODD);
        System.out.println("Using Funcion<Integer, Integer>");
        List<Integer> squaredNumbers = mapandcreatenewlistInteger(numbers, INTEGER_INTEGER_FUNCTION, "squared");
        System.out.println(squaredNumbers);
        List<Integer> cubedNumbers = mapandcreatenewlistInteger(numbers, INTEGER_INTEGER_F_CUBED, "cubed");
        System.out.println(cubedNumbers);
        List<Integer> doubleNumbers = mapandcreatenewlistInteger(numbers, INTEGER_INTEGER_F_DOUBLE, "double");
        System.out.println(doubleNumbers);
        System.out.println("Using Funcion<Integer, String>");
        List<String> squaredNumberOfString = mapandcreatenewlistString(numbers);
        System.out.println(squaredNumberOfString);
    }
}
