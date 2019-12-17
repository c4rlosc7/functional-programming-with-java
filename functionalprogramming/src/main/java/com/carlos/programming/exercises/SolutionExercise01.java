package com.carlos.programming.exercises;

import java.util.List;

public class SolutionExercise01 {

    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker");
        printAllCoursesIndividualFunction(courses);
    }

    private static void printAllCoursesIndividualFunction(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }
}
