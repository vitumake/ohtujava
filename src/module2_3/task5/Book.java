package module2_3.task5;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int pubYear;
    private ArrayList<String> reviews = new ArrayList<>();
    private int rating = 0;

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

    public void addReview(String review) {
        reviews.add(review);
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String[] getReviews() {
        return reviews.toArray(new String[reviews.size()]);
    }

    public int getRating() {
        return rating;
    }
}
