package module3_3.task3.library;

import module3_3.task3.library.model.*;
import module3_3.task3.library.system.*;


public class Main {
    public static void main(String[] args) {
               
        Library library = new Library();

        library.addBook(new Book("The Lord of the Rings", "J. R. R. Tolkien"));
        library.addBook(new Book("The Hobbit", "J. R. R. Tolkien"));
        library.addBook(new Book("The Silmarillion", "J. R. R. Tolkien"));
        
        LibraryMember member1 = library.addMember("John");
        LibraryMember member2 = library.addMember("Jane");
        
        library.borrowBook(library.getBooks().get(0), member1);
        library.borrowBook(library.getBooks().get(0), member2);

        library.reserveBook(library.getBooks().get(0), member1);

        library.returnBook(member1.getBorrowedBooks().get(0), member1);

        System.out.println("Member 1 reserved books:");
        System.out.println(member1.getReservedBooks());

        System.out.println("Member 1:");
        System.out.println(member1);
        
        System.out.println("Member 2:");
        System.out.println(member2);

        System.out.println("Books in library:");
        System.out.println(library.getBooks());
    }
}
