package module3_3.task2.library.model;

import java.util.ArrayList;

public class LibraryMember {
    private static int id;
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = ++id;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "LibraryMember: " + name + " (ID: " + memberId + ") has borrowed " + borrowedBooks.size() + " books.";
    }
}
