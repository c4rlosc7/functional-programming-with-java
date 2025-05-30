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