package module3.excercise32;

import java.util.ArrayDeque;

public class BookProcessor {
    ArrayDeque<Book> deque;

    public BookProcessor(ArrayDeque<Book> deque) {
        this.deque = deque;
    }

    public Book delete() {

        Book temporaryBook = null;

        while (deque.size() > 0) {
            temporaryBook = deque.pop();
        }
        return temporaryBook;
    }

    public void printSize() {
        System.out.println("Rozmiar kolejki: " + deque.size());
    }

    public void printSizeAfterDelete() {
        System.out.println("Rozmiar kolejki po usunięciu: " + deque.size());
    }
}
