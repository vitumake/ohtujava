package module2_3.task1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library catalog: ");
        books.forEach(b->System.out.println(books.indexOf(b)+1+". "+b.getInfo()));
    }

    public void displayBookByAuthor(String author) {
        System.out.println("Books by author \""+author+"\":");
        books.forEach(b->{
            if(b.getAuthor().matches(author)) System.out.println(b.getInfo());
        });
    }
}
