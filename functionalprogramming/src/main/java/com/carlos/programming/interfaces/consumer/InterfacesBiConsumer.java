package com.carlos.programming.interfaces.consumer;

import java.util.function.BiConsumer;

public class InterfacesBiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };

        biConsumer.accept("Hello", "How are u");
    }
}
