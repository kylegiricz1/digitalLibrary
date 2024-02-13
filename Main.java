package DigitalLibrary;

public class Main {
    public static void main(String[] args) {
        DigitalLibrary library = new DigitalLibrary();

        // Adding books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("1984", "George Orwell", 1949));

        // Displaying books in the library
        //library.displayBooks();
        library.displayBookTiltle();
    }
}
