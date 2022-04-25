package module3.excercise32;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "\"" + title + "\", autor: " + author + ", rok wydania: " + year;
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title) * 5 + Objects.hashCode(author) * 11 + year * 37;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) && year == book.year;
    }
}
