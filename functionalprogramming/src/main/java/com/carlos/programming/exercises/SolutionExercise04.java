package com.carlos.programming.exercises;

import java.util.Arrays;
import java.util.List;

public class SolutionExercise04 {
    private static void printCubesNumbersInListFunction(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("=======function-table of 10=======");
        printCubesNumbersInListFunction(listNumbers);
    }
}
