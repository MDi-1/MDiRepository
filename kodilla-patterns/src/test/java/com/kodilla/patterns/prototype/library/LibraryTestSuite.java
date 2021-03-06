package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    Library lib = new Library("biblioteka źródłowa");

    @Test
    void testGetBooks() {
        System.out.println("\n]]]] Kodilla zadanie 15.2 Library [[[[");

        Book ks1 = new Book("Dom dzienny, dom nocny",   "Olga Tokarczuk", LocalDate.of(1998, 1, 1));
        Book ks2 = new Book("Lśnienie",                 "Stephen King",   LocalDate.of(1977, 1, 1));
        Book ks3 = new Book("Lalka",                    "Bolesław Prus",  LocalDate.of(1890, 1, 1));
        Book ks4 = new Book("Księgi Jakubowe",          "Olga Tokarczuk", LocalDate.of(2014, 1, 1));
        Book ks5 = new Book("Faraon",                   "Bolesław Prus",  LocalDate.of(1897, 1, 1));
        Book ks6 = new Book("Krótka historia czasu",    "Stephen Hawking",LocalDate.of(1988, 1, 1));
        Book ks7 = new Book("Summa technologiae",       "Stanisław Lem",  LocalDate.of(1964, 1, 1));
        Book ks8 = new Book("Atlas chmur",              "David Mitchell", LocalDate.of(2004, 1, 1));

        lib.getBooks().add(ks1);
        lib.getBooks().add(ks2);
        lib.getBooks().add(ks3);
        lib.getBooks().add(ks4);
        lib.getBooks().add(ks5);
        lib.getBooks().add(ks6);
        lib.getBooks().add(ks7);
        lib.getBooks().add(ks8);

        // given
        Library shallowClone = null;
        try {
            shallowClone = lib.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        shallowClone.setName("biblioteka skopiowana płytko");

        Library deepClone = null;
        try {
            deepClone = lib.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepClone.setName("biblioteka skopiowana głęboko");

        // when
        lib.getBooks().remove(ks2);
        lib.getBooks().remove(ks4);

        // then
        System.out.println(lib);
        System.out.println(shallowClone);
        System.out.println(deepClone);

        assertEquals(6, lib.getBooks().size());
        assertEquals(6, shallowClone.getBooks().size());
        assertEquals(8, deepClone.getBooks().size());
        assertNotEquals(lib.getBooks().size(), deepClone.getBooks().size());
    }
}