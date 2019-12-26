package com.carlos.programming.distinct;

import java.util.Arrays;
import java.util.List;

public class SolutionDistinct {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,5,5,2);
        distinctListFunctional(listNumbers);
    }

    private static void distinctListFunctional(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(x -> System.out.println(x));
    }
}
