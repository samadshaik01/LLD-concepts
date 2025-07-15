package org.example.design_patterns.iterator_pattern;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {

    private List<Book> books;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    int cursor=0;

    @Override
    public boolean hasNext() {
        if(cursor<books.size())
            return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext())
            return books.get(cursor++);
        return null;
    }
}
