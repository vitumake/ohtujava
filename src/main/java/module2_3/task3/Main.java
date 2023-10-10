package module2_3.task3;

public class Main {

    public static void main(String[] args) {
        
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2000);
        Book book2 = new Book("Introduction to Python Programming", "John Smith", 2020);
        Book book3 = new Book("Introduction to C++ Programming", "Bjarne Stroustrup", 1980);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.borrowBook("Introduction to Java Programming");

        System.out.print("Is book \"Introduction to Java Programming\" available? ");
        System.out.println(library.isBookAvailable("Introduction to Java Programming"));

        library.returnBook("Introduction to Java Programming");

        System.out.print("Is book \"Introduction to Java Programming\" available? ");
        System.out.println(library.isBookAvailable("Introduction to Java Programming"));
    }
}
