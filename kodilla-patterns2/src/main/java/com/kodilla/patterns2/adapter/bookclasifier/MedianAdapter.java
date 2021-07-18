package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> map = new HashMap<>();
        for (Book book : bookSet) {
            String sign = book.getSignature();
            String author = book.getAuthor();
            String title = book.getTitle();
            int year = book.getPublicationYear();
            map.put(
                    new BookSignature(sign),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(author, title, year)
            );
        }
        return medianPublicationYear(map);
    }
}
