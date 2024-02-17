package lld.practise.book.Repository;

import lld.practise.book.model.Book;

import java.util.HashMap;
import java.util.Map;

public class BookStoreRepositoryImpl implements BookStoreRepository{
    private Map<Book, Integer> booksToBeStored = new HashMap<>();

    @Override
    public Book addNewBook(Book book) {
        Book newBook = searchBook(book.getTitle());

        if(newBook == null){
            newBook = book;
            booksToBeStored.put(newBook, 1);
            return newBook;
        } else{
            booksToBeStored.put(newBook, booksToBeStored.get(newBook)+1);
            return newBook;
        }


    }

    @Override
    public Book searchBook(String query) {
        for(Book b: booksToBeStored.keySet()){
            if(b.getTitle().equals(query)){
                return b;
            }
            else {
                return null;
            }
        }
        return null;
    }

    @Override
    public int getBookCount(Book book) {
        return booksToBeStored.getOrDefault(book, 0);
    }
}
