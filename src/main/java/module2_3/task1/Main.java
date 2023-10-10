package module2_3.task1;

public class Main {

    public static void main(String[] args) {
        
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2000);
        Book book2 = new Book("Introduction to Python Programming", "John Smith", 2020);
        Book book3 = new Book("Introduction to C++ Programming", "Bjarne Stroustrup", 1980);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        library.displayBookByAuthor("John Smith");
    }
}
