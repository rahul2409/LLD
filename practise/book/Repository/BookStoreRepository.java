package lld.practise.book.Repository;

import lld.practise.book.model.Book;

import java.util.Optional;

public interface BookStoreRepository {
    /*
    * The system should allow adding new books to the inventory, including information such as title, author, ISBN, publication date, genre, and quantity available.
    * Users should be able to search for books by title, author, or genre.
    * Users should be able to see the available quantity of each book.
    */
    Book addNewBook(Book book);
    Optional<Book> searchBook(String query);
    int getBookCount(Book book);
}
