package module3.excercise31;

public class Book {

    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public int hashCode() {
        return getPublicationYear() * 100;
    }

    @Override
    public boolean equals(Object o) {
        Book b = (Book) o;
        return (title.equals(b.getTitle())) && (author.equals(b.getAuthor())) && (publicationYear == b.getPublicationYear());
    }

    public String toString() {
        return title + " - written by: " + author + ", published in: " + publicationYear;
    }
}
