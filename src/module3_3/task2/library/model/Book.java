package module3_3.task2.library.model;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private static int count;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        ISBN = ++count;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (ISBN: " + ISBN + ")";
    }
}
