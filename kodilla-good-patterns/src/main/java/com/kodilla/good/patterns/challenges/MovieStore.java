package com.kodilla.good.patterns.challenges;

import java.util.*;

class MovieStore {

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    void run() {
        getMovies()
                .values()
                .stream()
                .forEach(e -> e.stream().forEach(s -> System.out.print(s + "!")));
    }

    public static void main(String[] args) {
        System.out.println("\nStarting Kodilla exercise 13.1 'funkcyjna iteracja po tytułach'.");
        MovieStore store = new MovieStore();
        store.run();
        System.out.println();
    }
}