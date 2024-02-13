package DigitalLibrary;

import java.util.ArrayList;
import java.util.List;

public class DigitalLibrary {
    private List<Book> books;

    public DigitalLibrary() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books available in the library:");
            for (Book book : books) {
                System.out.println(book);
            } 
        }
    }
    public void displayBookTiltle(){
            if (books.isEmpty()){
                System.out.println("No books in the library.");
            }
            else{
                for(Book book : books){
                    System.out.println(book.getTitle());
                }
            }
    }
}

