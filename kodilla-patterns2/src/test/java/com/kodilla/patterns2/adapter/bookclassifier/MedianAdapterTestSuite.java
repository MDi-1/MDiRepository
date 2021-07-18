package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        // given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author1", "title1", 1993, "sng001"));
        bookSet.add(new Book("author2", "title2", 1999, "sng002"));
        bookSet.add(new Book("author3", "title3", 2001, "sng003"));
        bookSet.add(new Book("author1", "title4", 2006, "sng004"));
        bookSet.add(new Book("author2", "title5", 2008, "sng005"));
        bookSet.add(new Book("author3", "title6", 2009, "sng006"));
        bookSet.add(new Book("author1", "title7", 2011, "sng007"));
        // when
        int median = adapter.publicationYearMedian(bookSet);
        System.out.println("\n" + median + "\n");
        // then
        assertEquals(2006, median);
    }
}
