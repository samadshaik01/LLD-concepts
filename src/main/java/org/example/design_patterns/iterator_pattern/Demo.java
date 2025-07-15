package org.example.design_patterns.iterator_pattern;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

/*      List<Integer> list = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> itr2 = list.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }*/

        Library library = new Library();
        library.addBook(new Book("abc", 100));
        library.addBook(new Book("def", 200));
        library.addBook(new Book("ghe", 300));

        Iterator<Book> itr = library.createIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
