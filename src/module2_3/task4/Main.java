package module2_3.task4;

public class Main {

    public static void main(String[] args) {
        
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2000);
        Book book2 = new Book("Introduction to Python Programming", "John Smith", 2020);
        Book book3 = new Book("Introduction to C++ Programming", "Bjarne Stroustrup", 1980);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        book1.addReview("Very good book!");
        book1.addReview("I like it!");
        book2.addReview("Very bad book!");

        book1.setRating(5);
        book2.setRating(1);
    }
}
