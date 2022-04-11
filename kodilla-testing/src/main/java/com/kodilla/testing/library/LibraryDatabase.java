package com.kodilla.testing.library;

import java.util.List;
import java.util.Set;

public interface LibraryDatabase {
    List<Book> listBooksWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);

}