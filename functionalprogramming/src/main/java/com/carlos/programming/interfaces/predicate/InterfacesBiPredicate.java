package com.carlos.programming.interfaces.predicate;

import java.util.function.BiPredicate;

public class InterfacesBiPredicate {
    public static void main(String[] args) {
        //BiPredicate<Integer, String> biPredicate = (num, str) -> true;
        BiPredicate<Integer, String> biPredicate = (num, str) -> {
          return (num<10) && (str.length()>5);
        };
        System.out.println(biPredicate.test(5, "test-biPredicate"));
    }
}
