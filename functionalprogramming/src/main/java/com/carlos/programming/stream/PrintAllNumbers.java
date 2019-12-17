package com.carlos.programming.stream;

import java.util.Arrays;
import java.util.List;

public class PrintAllNumbers {

    public static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunction(List<Integer> numbers) {
        numbers.stream()
                .forEach(PrintAllNumbers::print);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number:numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInListFunction(listNumbers);
        printAllNumbersInListStructured(listNumbers);
    }
}