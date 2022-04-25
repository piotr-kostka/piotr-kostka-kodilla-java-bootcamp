package module3.excercise35;

import java.util.HashMap;

public class MapProcessor {

    private HashMap<Book, String> mapBook;
    private long start;
    private long end;

    public MapProcessor(HashMap<Book, String> mapBook) {
        this.mapBook = mapBook;
    }

    public void searchMap() {
        start = System.nanoTime();
        mapBook.get(new Book("Autor55", "Tytuł55"));
        end = System.nanoTime();
        System.out.println("Szukanie po kluczu zajęło: " + (end - start) + "ns");
    }

    public void removeFromMap() {

        start = System.nanoTime();
        mapBook.remove(mapBook.size()-1);
        end = System.nanoTime();
        System.out.println("Usunięcie ostatniego elementu z mapy zajęło: " + (end - start) + "ns");
    }

    public void addToMap() {

        Book newBook = new Book("Nowy autor", "Nowy tytuł");

        start = System.nanoTime();
        mapBook.put(newBook, "Nowy opis");
        end = System.nanoTime();
        System.out.println("Dodanie elementu do mapy zajęło: " + (end - start) + "ns");
    }
}
