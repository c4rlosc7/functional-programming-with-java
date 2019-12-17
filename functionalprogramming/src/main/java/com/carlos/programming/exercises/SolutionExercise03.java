package com.carlos.programming.exercises;

import java.util.List;

public class SolutionExercise03 {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker");
        printAllCoursesIndividualFunction(courses);
    }

    private static void printAllCoursesIndividualFunction(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() == 3)
                .forEach(System.out::println);
    }
}
