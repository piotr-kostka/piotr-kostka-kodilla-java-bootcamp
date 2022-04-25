package module3.excercise35;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main (String[] args) {

        BookProcessor book = new BookProcessor(initBook());

        book.deleteFirst();
        book.deleteLast();
        book.addFirst();
        book.addLast();

        System.out.println();

        MapProcessor map = new MapProcessor(initBookMap());

        map.searchMap();
        map.removeFromMap();
        map.addToMap();
    }

    private static List<Book> initBook() {

        List<Book> book = new LinkedList<>();

        for (int i = 0; i < 789000; i++) {
            book.add(new Book("Autor" + i, "Tytuł" + i));
        }
        return book;
    }

    private static HashMap<Book, String> initBookMap() {

        HashMap<Book, String> mapBook = new HashMap<>();

        for (int n = 0; n < 555000; n++) {

            mapBook.put(new Book("Autor" + n, "Tytuł" + n), "Opis" + n);
        }
        return mapBook;
    }
}
