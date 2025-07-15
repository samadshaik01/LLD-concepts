package org.example.design_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
