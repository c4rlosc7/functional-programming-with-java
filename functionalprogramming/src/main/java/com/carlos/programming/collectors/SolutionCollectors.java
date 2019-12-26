package com.carlos.programming.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionCollectors {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,5,5,2);
        System.out.println(doubleList(listNumbers));
        System.out.println(evenNumbersList(listNumbers));
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }

    private static List<Integer> evenNumbersList(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
    }
}
