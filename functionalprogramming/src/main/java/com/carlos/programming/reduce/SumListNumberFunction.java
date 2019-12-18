package com.carlos.programming.reduce;

import java.util.Arrays;
import java.util.List;

public class SumListNumberFunction {

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4);
        System.out.println(addListFunctional(listNumbers));
        System.out.println(addListFunctional2(listNumbers));
        System.out.println(addListFunctional3(listNumbers));
        System.out.println("max: " + maxNumberOfList(listNumbers));
    }

    private static int sum(int a, int b) {
        //System.out.println("a: " + a + ", b: " + b);
        return a + b;
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, SumListNumberFunction::sum);
    }

    private static int addListFunctional2(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (x,y) -> x+y);
    }

    private static int addListFunctional3(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    private static int maxNumberOfList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (x,y) -> x>y ? x:y);
    }

}
