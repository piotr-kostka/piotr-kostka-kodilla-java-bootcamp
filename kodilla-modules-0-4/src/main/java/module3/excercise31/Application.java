package module3.excercise31;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main (String[] args) {

        Set<Book> books = new HashSet<>(initBook());

        BookProcessor bookProcessor = new BookProcessor(initBook());
        Set<Book> filteredBooks = bookProcessor.filterBook(2010);
        bookProcessor.printBooks(filteredBooks);
    }

    private static Set<Book> initBook() {

        Set<Book> books = new HashSet<>();

        books.add(new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 1997));
        books.add(new Book("Taniec ze smokami", "G.R.R. Martin", 2011));
        books.add(new Book("Ślepnąc od świateł", "J. Żulczyk", 2014));
        books.add(new Book("Gra o tron", "G.R.R Martin", 1996));
        books.add(new Book("Harry Potter i Więzień Azkabanu", "J.K. Rowling", 1999));
        books.add(new Book("Anioły i Demony", "D. Brown", 2000));
        books.add(new Book("Inferno", "D. Brown", 2013));
        books.add(new Book("Początek", "D. Brown", 2017));
        books.add(new Book("Kod Leonarda da Vinci", "D. Brown", 2003));

        return books;
    }
}
