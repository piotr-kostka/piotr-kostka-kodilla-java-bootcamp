package module3.excercise32;

import java.util.ArrayDeque;

public class Application {

    public static void main (String[] args) throws java.lang.Exception {

        BookProcessor processor = new BookProcessor(initDeque());

        processor.printSize();
        Book deleteBook = processor.delete();
        processor.printSizeAfterDelete();
        System.out.println("Ostatnia usunięta książka z kolejki: \n   " + deleteBook);

    }

    public static ArrayDeque<Book> initDeque() {

        ArrayDeque<Book> deque = new ArrayDeque<Book>();

        deque.push(new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 1997));
        deque.push(new Book("Ślepnąc od świateł", "J. Żulczyk", 2014));
        deque.push(new Book("Anioły i Demony", "D. Brown", 2000));
        deque.push(new Book("Gra o tron", "G.R.R Martin", 1996));
        deque.push(new Book("Harry Potter i Więzień Azkabanu", "J.K. Rowling", 2002));

        return deque;
    }
}
