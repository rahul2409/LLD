package lld.practise.book;

import lld.practise.book.Repository.BookStoreRepository;
import lld.practise.book.Repository.BookStoreRepositoryImpl;
import lld.practise.book.model.Book;

import java.util.Date;

/*
* Imagine you're designing a system for an online bookstore.
* Your task is to design a module that handles the process of adding new books to the bookstore's inventory and retrieving information about available books.

Requirements:

The system should allow adding new books to the inventory, including information such as title, author, ISBN, publication date, genre, and quantity available.
Users should be able to search for books by title, author, or genre.
Users should be able to see the available quantity of each book.
* */
public class Main {
    public static void main(String[] args) {
        // Create a sample Book
        // To add this book we will need a book store which holds the book and quantity available.

        Book book = new Book("harry potter", "James Gosling", "ISBN1234", new Date(), "Fiction" );
        BookStoreRepository bookStoreRepository = new BookStoreRepositoryImpl();

        book = bookStoreRepository.addNewBook(book);
        System.out.println("The book has been added " + book.getTitle() + " and quantity is " + bookStoreRepository.getBookCount(book));

        Book book2 = new Book("harry potter", "James Gosling", "ISBN1234", new Date(), "Fiction" );
        book2 = bookStoreRepository.addNewBook(book2);
        System.out.println("The book has been added " + book2.getTitle() + " and quantity is " + bookStoreRepository.getBookCount(book2));
    }
}
