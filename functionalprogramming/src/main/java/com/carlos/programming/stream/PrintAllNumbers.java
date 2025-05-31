package com.carlos.programming.stream;

import com.carlos.programming.constant.Constants;

import java.util.List;

public class PrintAllNumbers {

    public static void print(int number) {
        System.out.println(number);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number:numbers) {
            System.out.println(number);
        }
    }

    private static void printAllNumbersInListFunction(List<Integer> numbers) {
        numbers.stream()
                .filter(PrintAllNumbers::isEven)
                .forEach(PrintAllNumbers::print);
    }

    public static void main(String[] args) {
        printAllNumbersInListFunction(Constants.INTEGER_LIST);
        // printAllNumbersInListStructured(listNumbers);
    }
}