package module2_3.task3;

public class Book {
    private String title;
    private String author;
    private int pubYear;

    public Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public String getInfo() {
        return "Title: "+title+" Author: "+author+" Year: "+pubYear;
    }
}
