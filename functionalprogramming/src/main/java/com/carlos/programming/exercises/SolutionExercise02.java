package com.carlos.programming.exercises;

import java.util.List;

public class SolutionExercise02 {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "API",
                                       "Microservices", "AWS", "Docker",
                                       "spring security", "solid", "ribbon");
        printAllCoursesIndividualFunction(courses);
    }

    private static void printAllCoursesIndividualFunction(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("spring"))
                .forEach(System.out::println);
    }
}
