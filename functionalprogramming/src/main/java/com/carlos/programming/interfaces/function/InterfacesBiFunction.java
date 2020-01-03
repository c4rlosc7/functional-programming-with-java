package com.carlos.programming.interfaces.function;

import java.util.function.BiFunction;

public class InterfacesBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, String, String> biFunction = (num, str1) -> {
            return num + " = " + str1;
        };

        System.out.println(biFunction.apply(2,"test"));
    }
}
