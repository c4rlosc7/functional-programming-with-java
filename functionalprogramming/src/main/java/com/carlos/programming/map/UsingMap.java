package com.carlos.programming.map;

import java.util.Arrays;
import java.util.List;

public class UsingMap {

    private static void printMultiOfNumbersInListFunction(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * 10)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("=======function-table of 10=======");
        printMultiOfNumbersInListFunction(listNumbers);
    }
}
