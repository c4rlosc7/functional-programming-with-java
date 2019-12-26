package com.carlos.programming.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SolutionSorted {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,5,5,2);
        List<String> listSoccerPlayers = Arrays.asList("Xavi", "Andres Iniesta", "Iker Casillas",
                                                        "Sergio Busquets", "Xabi Alonso", "David Silva",
                                                        "Sergio Ramos", "Gerard Pique");
        sortedListFunctional(listNumbers);
        distinctAndSortedListFunctional(listNumbers);
        sortedListSoccerPlayersFunctional(listSoccerPlayers);
        sortedReverseListSoccerPlayersFunctional(listSoccerPlayers);
        sortedReverseLengthListSoccerPlayersFunctional(listSoccerPlayers);
    }

    private static void sortedListFunctional(List<Integer> numbers) {
        numbers.stream()
                .sorted()
                .forEach(x -> System.out.print(x));
        System.out.println();
    }

    private static void distinctAndSortedListFunctional(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(x -> System.out.print(x));
        System.out.println();
    }
    private static void sortedListSoccerPlayersFunctional(List<String> players) {
        players.stream()
                .sorted()
                .forEach(x -> System.out.println(x));
    }

    private static void sortedReverseListSoccerPlayersFunctional(List<String> players) {
        System.out.println("----------reverse----------");
        players.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x));
    }

    private static void sortedReverseLengthListSoccerPlayersFunctional(List<String> players) {
        System.out.println("----------comparing-length----------");
        players.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(x -> System.out.println(x));
    }

}
