package com.kodilla.testing.library;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    private LibraryUser user = new LibraryUser("Jan", "Kowalski", "94092709948");;

    private LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    private BookLibrary testee = new BookLibrary(libraryDatabaseMock);

    //Testy z przykładów MOD-6.6//
    @Test
    void testListBooksWithConditionsReturnList () {
    // Given
    List<Book> expected = new ArrayList<>();
    Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
    Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
    Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
    Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
    expected.add(book1);
    expected.add(book2);
    expected.add(book3);
    expected.add(book4);
    when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(expected);

    // When
    List<Book> result = testee.listBooksWithCondition("Secret");

    // Then
    assertEquals(expected, result);
    }

    @Test
    void testListBooksWithConditionMoreThan20 () {
    // Given
    List<Book> expected0Books = new ArrayList<Book>();
    List<Book> expected15Books = generateListOfNBooks(15);
    List<Book> expected40Books = generateListOfNBooks(40);
    when(libraryDatabaseMock.listBooksWithCondition(anyString()))
            .thenReturn(expected15Books);
    when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
            .thenReturn(expected0Books);
    when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
            .thenReturn(expected40Books);

    // When
    List<Book> result0Books = testee.listBooksWithCondition("ZeroBooks");
    List<Book> result15Books = testee.listBooksWithCondition("Any title");
    List<Book> result40Books = testee.listBooksWithCondition("FortyBooks");

    // Then
    assertEquals(expected0Books, result0Books);
    assertEquals(expected15Books, result15Books);
    assertEquals(0, result40Books.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3 () {
    // Given

    // When
    List<Book> result = testee.listBooksWithCondition("An");

    // Then
    assertEquals(0, result.size());
    verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf0Books() {
    //Given
    List<Book> expected = new ArrayList<>();
    when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(expected);

    // When
    List<Book> result = testee.listBooksInHandsOf(user);

    // Then
    assertEquals(expected, result);
    }

    @Test
    void testListBooksInHandsOf1Book() {
    //Given
    List<Book> expected = generateListOfNBooks(1);
    when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(expected);

    // When
    List<Book> result = testee.listBooksInHandsOf(user);

    // Then
    assertEquals(expected, result);
    }

    @Test
    void testListBooksInHandsOf5Books() {
    //Given
    List<Book> expected = generateListOfNBooks(5);
    when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(expected);

    // When
    List<Book> result = testee.listBooksInHandsOf(user);

    // Then
    assertEquals(expected, result);
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}