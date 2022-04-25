package module3.excercise35;

import java.util.List;

public class BookProcessor {

    private List<Book> book;
    private long start;
    private long end;

    public BookProcessor(List<Book> book) {
        this.book = book;
    }

    public void deleteFirst() {

        start = System.nanoTime();
        book.remove(0);
        end = System.nanoTime();

        System.out.println("Usunięcie pierwszego elementu LinkedList zajęło: " + (end - start) + "ns");
    }

    public void deleteLast() {

        start = System.nanoTime();
        book.remove(book.size()-1);
        end = System.nanoTime();

        System.out.println("Usunięcie ostatniego elementu LinkedList zajęło: " + (end - start) + "ns");
    }

    public void addFirst() {

        start = System.nanoTime();
        book.add(0, new Book("Autor" + book.size(), "Tytuł" + book.size()));
        end = System.nanoTime();

        System.out.println("Dodanie elementu na początku LinkedList zajęło: " + (end - start) + "ns");
    }

    public void addLast() {
        start = System.nanoTime();
        book.add(new Book("Autor" + book.size(), "Tytuł" + book.size()));
        end = System.nanoTime();

        System.out.println("Dodanie elementu na końcu LinkedList zajęło: " + (end - start) + "ns");
    }
}
