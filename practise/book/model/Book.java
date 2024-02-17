package lld.practise.book.model;

import java.util.Date;

public class Book {
    // including information such as title, author, ISBN, publication date, genre, and quantity available
    private String title;
    private String author;
    private String ISBN;
    private Date publishedOn;
    private String genre;

    public Book(String title, String author, String ISBN, Date publishedOn, String genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publishedOn = publishedOn;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
