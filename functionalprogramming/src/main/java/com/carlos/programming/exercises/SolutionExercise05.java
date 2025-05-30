package com.carlos.programming.exercises;

import java.util.ArrayList;
import java.util.List;

public class SolutionExercise05 {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker");
        printLengthOfCoursesIndividualFunction(courses);
    }

    private static void printLengthOfCoursesIndividualFunction(List<String> courses) {
        courses.stream()
                .map(course -> course + ", length: " + course.length())
                .forEach(System.out::println);
    }
}
