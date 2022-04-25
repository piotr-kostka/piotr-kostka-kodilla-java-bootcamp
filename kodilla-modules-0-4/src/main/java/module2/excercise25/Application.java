package module2.excercise25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main (String[] args) {

        //Część 1

        //ITDegrees processor = new ITDegrees(initDegrees());
        System.out.println("Średnia ocen: " + new ITDegrees(initDegrees()).average() + "\n");

        //Część 2
        BookProcessor bookProcessor = new BookProcessor(initBook());
        //List<BookData> filteredBooks = bookProcessor.filterAfterYear(2000);
        bookProcessor.printBooks(bookProcessor.filterAfterYear(2000));
    }

    private static List<Integer> initDegrees() {

        List<Integer> degrees = new ArrayList<>();

        degrees.add(3);
        degrees.add(2);
        degrees.add(4);
        degrees.add(1);
        degrees.add(3);
        degrees.add(4);
        degrees.add(1);
        degrees.add(6);
        degrees.add(5);
        degrees.add(3);
        degrees.add(6);
        degrees.add(4);
        degrees.add(5);
        degrees.add(5);
        degrees.add(6);
        degrees.add(4);

        return degrees;
    }

    private static List<BookData> initBook() {

        List<BookData> books = new LinkedList<>();

        books.add(new BookData("Harry Potter i Kamień Filozoficzny" , 1997));
        books.add(new BookData("Harry Potter i Komnata Tajemnic" , 1998));
        books.add(new BookData("Harry Potter i Więzień Azkabanu" , 1999));
        books.add(new BookData("Harry Potter i Czara Ognia" , 2000));
        books.add(new BookData("Harry Potter i Zakon Feniksa" , 2003));
        books.add(new BookData("Harry Potter i Książe Półkrwi" , 2005));
        books.add(new BookData("Harry Potter i Insygnia Śmierci" , 2007));
        books.add(new BookData("Gra o tron", 1996));
        books.add(new BookData("Starcie królów", 1998));
        books.add(new BookData("Nawałnica mieczy. Stal i śnieg", 2000));
        books.add(new BookData("Nawałnica mieczy. Krew i złoto", 2000));
        books.add(new BookData("Uczta dla wron. Cienie śmierci", 2005));
        books.add(new BookData("Uczta dla wron. Sieć spisków", 2005));
        books.add(new BookData("Taniec ze smokami", 2011));

        return books;
    }
}
