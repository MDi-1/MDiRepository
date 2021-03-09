package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepCopyItem = super.clone();
        deepCopyItem.books = new HashSet<>();
        for (Book book : books) {
            deepCopyItem.getBooks().add(book);
        }
        return deepCopyItem;
    }

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }
}