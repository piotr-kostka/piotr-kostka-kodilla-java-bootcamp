package module2.excercise25;

import java.util.LinkedList;
import java.util.List;

public class BookProcessor {
    private List<BookData> books;

    public BookProcessor(List<BookData> books) {
        this.books = books;
    }

    public List<BookData> filterAfterYear(int year) {

        List<BookData> filteredBooks = new LinkedList<>();

        for (BookData book : books) {
            if (book.getPublicationYear() > year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public void printBooks(List<BookData> filteredBooks) {

        for (BookData book : filteredBooks) {
            System.out.println(book.getTitle());
        }
    }
}
