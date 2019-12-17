package com.carlos.programming.filter;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {

    public static Boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListFunction(List<Integer> numbers) {
        numbers.stream()
                .filter(PrintEvenNumbers::isEven)
                .forEach(System.out::println);
    }

    private static void printEventNumbersInListStructured(List<Integer> numbers) {
        for (int number:numbers) {
            if (number%2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println("=======function-even=======");
        printEvenNumbersInListFunction(listNumbers);
        System.out.println("=======structured-even=======");
        printEventNumbersInListStructured(listNumbers);
    }
}
