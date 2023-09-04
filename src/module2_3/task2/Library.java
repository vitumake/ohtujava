package module2_3.task2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library catalog: ");
        books.forEach(b->System.out.println(books.indexOf(b)+1+". "+(borrowedBooks.contains(b)?"(borrowed) ":"")+b.getInfo()));
    }

    public void displayBookByAuthor(String author) {
        System.out.println("Books by author \""+author+"\":");
        books.forEach(b->{
            if(b.getAuthor().matches(author)) System.out.println(b.getInfo());
        });
    }

    public Book findBook(String title) {
        for(Book b: books) {
            if(b.getTitle().matches(title)) return b;
        }
        return null;
    }

    public void borrowBook(String title) {
        Book book = findBook(title);
        if(book!=null && !borrowedBooks.contains(book)) {
            System.out.println("Book \""+title+"\" borrowed.");
            borrowedBooks.add(book);
        }
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if(book!=null && borrowedBooks.contains(book)) {
            System.out.println("Book \""+title+"\" returned.");
            borrowedBooks.remove(book);
        }
    }
}
