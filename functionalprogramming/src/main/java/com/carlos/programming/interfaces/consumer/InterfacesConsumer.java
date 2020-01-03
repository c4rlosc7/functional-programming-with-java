package com.carlos.programming.interfaces.consumer;

import java.util.function.Consumer;

public class InterfacesConsumer {
    public static void main(String[] args) {
        Consumer<Integer> systemOutConsumer = x -> System.out.println(x);
    }
}
