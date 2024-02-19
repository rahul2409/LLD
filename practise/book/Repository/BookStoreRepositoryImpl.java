package lld.practise.book.Repository;

import lld.practise.book.model.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BookStoreRepositoryImpl implements BookStoreRepository{
    private Map<Book, Integer> booksToBeStored = new HashMap<>();

    @Override
    public Book addNewBook(Book book) {
        Optional<Book> newBook = searchBook(book.getTitle());
        if(newBook.isEmpty()){
            booksToBeStored.put(book, 1);
            return book;
        } else{
            booksToBeStored.put(newBook.get(), booksToBeStored.get(newBook.get())+1);
            return newBook.get();
        }
    }

    // Author name, Title, ISBN
    @Override
    public Optional<Book> searchBook(String query) {
        for(Book b: booksToBeStored.keySet()){
            if(b.getTitle().equals(query) || b.getISBN().equals(query) || b.getAuthor().equals(query)){
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    @Override
    public int getBookCount(Book book) {
        return booksToBeStored.getOrDefault(book, 0);
    }
}
