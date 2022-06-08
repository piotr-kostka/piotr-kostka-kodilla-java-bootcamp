package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Book book1 = new Book("Gra o Tron", "G.R.R. Martin", LocalDate.of(1997,4,22));
        Book book2 = new Book("Lsnienie", "S. King", LocalDate.of(1994,3,30));
        Book book3 = new Book("Harry Potter", "J.K. Rowling", LocalDate.of(1997,5,24));
        Book book4 = new Book("Slepnac od swiatel", "J. Zulczyk", LocalDate.of(2015,6,21));

        Library library = new Library("Library no. 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //shallow copy
        Library shallowLibrary = null;
        try {
            shallowLibrary = library.shallowCopy();
            shallowLibrary.setName("Library no. 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepLibrary = null;
        try {
            deepLibrary = library.deepCopy();
            deepLibrary.setName("Library no. 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book1);

        //then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, shallowLibrary.getBooks().size());
        assertEquals(4, deepLibrary.getBooks().size());
        assertEquals(shallowLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepLibrary.getBooks(), library.getBooks());
    }
}
