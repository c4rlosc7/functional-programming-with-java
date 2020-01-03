package com.carlos.programming.interfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class InterfacesSupplier {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Supplier<Integer> randomIntegerSupplier = () -> 20;
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        System.out.println(randomIntegerSupplier.get());
    }
}
