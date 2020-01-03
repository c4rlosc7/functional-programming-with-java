package com.carlos.programming.interfaces.unaryoperator;

import java.util.function.UnaryOperator;

public class InterfacesUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> x * 3;
        System.out.println(unaryOperator.apply(10));
    }
}
