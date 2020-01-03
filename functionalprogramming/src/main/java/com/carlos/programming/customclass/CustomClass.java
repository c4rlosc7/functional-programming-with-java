package com.carlos.programming.customclass;

import com.carlos.programming.pojos.Course;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomClass {

    public static final Predicate<Course> PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_90 =
            course -> course.getReviewScore() > 90;

    public static final Predicate<Course> PREDICATE_COURSE_REVIEWSCORE_LESS_THAT_90 =
            course -> course.getReviewScore() < 90;

    public static final Predicate<Course> PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95 =
            course -> course.getReviewScore() > 95;

    public static final Comparator<Course> COMPARING_BY_NO_OF_STUDENTS_INCREASING =
            Comparator.comparingInt(Course::getNoOfStudents);

    public static final Comparator<Course> COMPARING_BY_NO_OF_STUDENTS_DECREASING =
            Comparator.comparingInt(Course::getNoOfStudents).reversed();

    public static final Comparator<Course> COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS =
            Comparator.comparingInt(Course::getNoOfStudents)
            .thenComparingInt(Course::getReviewScore)
            .reversed();

    private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
        return course -> course.getReviewScore() > cutoffReviewScore;
    }
    public static void main(String[] args) {
        List<Course> courses = List.of(
            new Course("Spring", "Framework", 98, 20000),
            new Course("Spring Boot", "Framework", 95, 18000),
            new Course("API", "Microservices", 97, 22000),
            new Course("Microservices", "Microservices", 96, 25000),
            new Course("FullStack", "FullStack", 91, 14000),
            new Course("AWS", "Cloud", 92, 21000),
            new Course("Azure", "Cloud", 99, 21000),
            new Course("Docker", "Cloud", 92, 20000),
            new Course("Kubernetes", "Cloud", 91, 20000)
        );

        // allMatch, noneMatch, anyMatch
        System.out.println("_allMatch");
        System.out.println(courses.stream().allMatch(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_90));
        System.out.println(courses.stream().allMatch(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95));
        System.out.println("_noneMatch");
        System.out.println(courses.stream().noneMatch(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_90));
        System.out.println(courses.stream().noneMatch(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95));
        System.out.println(courses.stream().noneMatch(PREDICATE_COURSE_REVIEWSCORE_LESS_THAT_90));
        System.out.println("_anyMatch");
        System.out.println(courses.stream().anyMatch(PREDICATE_COURSE_REVIEWSCORE_LESS_THAT_90));
        System.out.println(courses.stream().anyMatch(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_90));

        System.out.println("COMPARING_BY_NO_OF_STUDENTS_INCREASING");
        System.out.println(
                courses.stream()
                        .sorted(COMPARING_BY_NO_OF_STUDENTS_INCREASING)
                        .collect(Collectors.toList()));
        //[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000},
        // Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000},
        // Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}]

        System.out.println("COMPARING_BY_NO_OF_STUDENTS_DECREASING");
        System.out.println(
                courses.stream()
                        .sorted(COMPARING_BY_NO_OF_STUDENTS_DECREASING)
                        .collect(Collectors.toList()));
        //[Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000},
        // Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000},
        // Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]

        System.out.println("COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS");
        System.out.println(
                courses.stream()
                        .sorted(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS)
                        .collect(Collectors.toList()));
        //[Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000},
        // Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000},
        // Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]

        System.out.println(
                courses.stream()
                        .sorted(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS)
                        .limit(5)
                        .collect(Collectors.toList()));
        //[Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000},
        // Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}]

        System.out.println(
                courses.stream()
                        .sorted(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS)
                        .skip(3)
                        .collect(Collectors.toList()));
        //[Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000},
        // Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]

        System.out.println(
                courses.stream()
                        .sorted(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS)
                        .skip(3)
                        .limit(5)
                        .collect(Collectors.toList()));
        //[Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}]

        System.out.println(courses);
        //[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000},
        // Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000},
        // Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000},
        // Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}]

        System.out.println("Review score >= 95, takeWhile");
        System.out.println(
                courses.stream()
                        .takeWhile(course -> course.getReviewScore()>=95)
                        .collect(Collectors.toList()));
        //[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000},
        // Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}]

        System.out.println("Review score >= 95, dropWhile");
        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore()>=95)
                        .collect(Collectors.toList()));
        //[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000},
        // Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}]

        System.out.println(
                courses.stream()
                        .max(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS));
        //Optional[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]

        System.out.println(
                courses.stream()
                        .min(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
        );
        //Optional[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]
        //Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_LESS_THAT_90)
                        .min(COMPARING_BY_NO_OF_STUDENTS_AND_NO_OF_REVIEWS)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
        );
        //Optional.empty
        //Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_LESS_THAT_90)
                        .findFirst()
        );
        //Optional.empty

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95)
                        .findFirst()
        );
        //Optional[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}]

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95)
                        .findAny()
        );
        //Optional[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}]

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95)
                        .mapToInt(Course::getNoOfStudents)
                        .sum());
        //88000

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95)
                        .mapToInt(Course::getNoOfStudents)
                        .average());
        //OptionalDouble[22000.0]

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95)
                        .mapToInt(Course::getNoOfStudents)
                        .count());
        //4

        System.out.println(
                courses.stream()
                        .filter(PREDICATE_COURSE_REVIEWSCORE_GREATER_THAT_95)
                        .mapToInt(Course::getNoOfStudents)
                        .max());
        //OptionalInt[25000]

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory)));
        //{Cloud=[Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000},
        // Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000},
        // Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}],
        // FullStack=[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}],
        // Microservices=[Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000},
        // Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}],
        // Framework=[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}]}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
        //{Cloud=4, FullStack=1, Microservices=2, Framework=2}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
        //{Cloud=Optional[Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000}],
        // FullStack=Optional[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}],
        // Microservices=Optional[Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000}],
        // Framework=Optional[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}]}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.mapping(Course::getName, Collectors.toList()))));
        //{Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices],
        // Framework=[Spring, Spring Boot]}

        Predicate<Course> reviewScoreGreaterThan95Predicate2
                = createPredicateWithCutoffReviewScore(95);

        Predicate<Course> reviewScoreGreaterThan90Predicate2
                = createPredicateWithCutoffReviewScore(90);
    }
}
