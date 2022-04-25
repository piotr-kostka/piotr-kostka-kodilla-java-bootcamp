package module3.excercise35;

import java.util.Objects;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {

        this.author = author;
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author) * 5 + Objects.hashCode(title) * 37;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.author) && author.equals(book.title);
    }

    public String toString() {
        return author + "," + title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
