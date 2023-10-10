package module3_3.task2.library.system;

import java.util.ArrayList;
import module3_3.task2.library.model.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public LibraryMember addMember(String name) {
        LibraryMember member = new LibraryMember(name);
        members.add(member);
        return member;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void borrowBook(Book book, LibraryMember member) {
        if(books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
        }
        else System.out.println("Book not found.");
    }

    public void returnBook(Book book, LibraryMember member) {
        if(member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            books.add(book);
        }
        else System.out.println("Book not found.");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<LibraryMember> getMembers() {
        return members;
    }
}
