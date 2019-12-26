package com.carlos.programming.interfaces.predicate;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class InterfacesPredicate {

    public static final Predicate<Integer> INTEGER_PREDICATE = x -> x % 2 == 0;
    public static final Predicate<Integer> INTEGER_PREDICATE2 = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        }
    };
    public static final Function<Integer, Integer> INTEGER_INTEGER_FUNCTION = x -> x * x;
    public static final Function<Integer, Integer> INTEGER_INTEGER_FUNCTION2 = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer * integer;
        }
    };
    public static final Consumer<Integer> PRINTLN = System.out::println;
    public static final Consumer<Integer> PRINTLN2 = new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {
            System.out.println(integer);
        }
    };
    public static final BinaryOperator<Integer> SUM = Integer::sum;
    public static final BinaryOperator<Integer> SUM2 = new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer a, Integer b) {
            return a + b;
        }
    };

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        numbers.stream()
                .filter(INTEGER_PREDICATE)
                .map(INTEGER_INTEGER_FUNCTION)
                .forEach(PRINTLN);

        int sum = numbers.stream()
                         .reduce(0, SUM);
        System.out.println("The sum is: " + sum);
    }
}
