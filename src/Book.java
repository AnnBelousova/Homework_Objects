public class Book {
    private String title;
    private final Author author;
    private int year;

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(Author author, String title, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

}
