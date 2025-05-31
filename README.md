# functional-programming-with-java

## What is functional programming ?

Functional programming in Java is a programming paradigm that emphasizes the use of pure functions, immutability, and declarative style. It aims to write code that is more concise, easier to understand, and less prone to bugs by treating computation as the evaluation of mathematical functions.
Here are the key concepts of functional programming in Java:

### Pure functions:

These functions always produce the same output for the same input and have no side effects (i.e., they don't modify any state outside their scope).

### Immutability:

Data is not modified after it is created. Instead, new data structures are created when changes are needed.

### First-class functions:

Functions can be treated like any other data type, meaning they can be passed as arguments to other functions, returned from functions, and assigned to variables.

### Lambda expressions:

Anonymous functions that can be used to implement functional interfaces concisely.

### Functional interfaces:

Interfaces with a single abstract method, which can be implemented using lambda expressions.

### Higher-order functions:

Functions that take other functions as arguments or return functions as results.

### Streams:

A sequence of elements that can be processed in a functional style using operations like map, filter, and reduce.
Java 8 introduced several features to support functional programming, including lambda expressions, functional interfaces, and the Streams API. These features allow developers to write more functional-style code in Java, although it is still primarily an object-oriented language.

First example:

```Java
List<Integer> listNumbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
listNumbers.stream().forEach(PrintAllNumbers::print);
```

## What is lambda expression ?

A lambda expression in Java is a concise way to represent an anonymous function—that is, a function without a name that can be passed around as a value.

Introduced in Java 8, lambda expressions are a key feature for enabling functional programming and are especially useful with Java’s Stream API, Collections, and functional interfaces.

```java
import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Using lambda to sort
        names.sort((a, b) -> a.compareTo(b));

        System.out.println(names);  // [Alice, Bob, Charlie]
    }
}
```

### Benefits of Lambda Expressions

- Concise	Less boilerplate code compared to anonymous classes
- Readable	Clean, functional-style code
- Composable	Easily used with streams, filters, maps, etc.


### Common Use Cases

- Collections (sort, forEach, filter)
- Streams (map, reduce, collect)
- Functional interfaces like Runnable, Callable, Supplier, Consumer, Function, Predicate


## The Java Stream API

The Java Stream API (introduced in Java 8) allows you to process collections of data in a declarative, functional style—similar to SQL or functional programming languages.

Instead of writing loops and manual logic, you can chain operations like filter, map, sort, and collect.

### Stream Pipeline: 3 Steps

- Source – e.g., a List, Set, array, etc.
- Intermediate Operations – e.g., filter, map, sorted (returns a new stream)
- Terminal Operation – e.g., collect, forEach, count (ends the pipeline)

```java
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Alex", "Brian");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
```

### Common Stream Operations

- filter()	Intermediate	Filters elements
- map()	Intermediate	Transforms each element
- sorted()	Intermediate	Sorts the stream
- limit(n)	Intermediate	Truncates stream
- collect()	Terminal	Collects results into a list, set, etc.
- forEach()	Terminal	Applies an action to each element
- count()	Terminal	Counts elements


### Convert to UPPERCASE

```java
List<String> upper = names.stream()
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());
```

### Count elements that match 

```java
long count = names.stream()
                  .filter(name -> name.length() > 3)
                  .count();
```

### Convert to Set

```java
Set<String> set = names.stream()
                       .collect(Collectors.toSet());
```