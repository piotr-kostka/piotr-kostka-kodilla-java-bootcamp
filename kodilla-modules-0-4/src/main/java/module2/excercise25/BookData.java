package module2.excercise25;

public class BookData {
    private String title;
    private int publicationYear;

    public BookData(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
}
