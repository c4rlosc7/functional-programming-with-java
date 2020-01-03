package com.carlos.programming.exercises;

import java.util.List;

public class SolutionExercise06 {

    private static void print(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker");
        //printLengthOfCoursesUpperCaseFunction(courses);
        printLengthOfCoursesUpperCaseFunction2(courses);
    }

    private static void printLengthOfCoursesUpperCaseFunction(List<String> courses) {
        courses.stream()
                .map(course -> course.toUpperCase())
                .forEach(System.out::println);
    }

    /**
     * Using print to references
     * @param courses
     */
    private static void printLengthOfCoursesUpperCaseFunction2(List<String> courses) {
        courses.stream()
                .map(course -> course.toUpperCase())
                .forEach(SolutionExercise06::print);
    }
}
