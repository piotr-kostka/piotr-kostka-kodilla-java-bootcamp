package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 2010, "000154c"));
        books.add(new Book("Author 2", "Title 2", 2011, "000158h"));
        books.add(new Book("Author 3", "Title 3", 2012, "000153d"));
        books.add(new Book("Author 4", "Title 4", 2013, "00015v8"));
        books.add(new Book("Author 5", "Title 5", 2014, "000153f"));
        books.add(new Book("Author 6", "Title 6", 2015, "000159k"));
        books.add(new Book("Author 7", "Title 7", 2016, "000154x"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2013, median);
    }
}
