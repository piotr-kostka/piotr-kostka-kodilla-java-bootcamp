package module3.excercise31;

import java.util.HashSet;
import java.util.Set;

public class BookProcessor {

    private Set<Book> books;

    public BookProcessor(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> filterBook(int year) {

        Set<Book> filteredBooks = new HashSet<>();

        for (Book book: books) {
            if (book.getPublicationYear() < year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public void printBooks(Set<Book> filteredBooks) {

        for (Book book: filteredBooks) {
            System.out.println(book);
        }
    }
}
