package BookTask;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    private int bookArticle;
    private String bookName;
    private int bookRelease;
    private Book books;

    public int getBookArticle() {
        return bookArticle;
    }

    public void setBookArticle(int bookArticle) {
        this.bookArticle = bookArticle;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookRelease() {
        return bookRelease;
    }

    public void setBookRelease(int bookRelease) {
        this.bookRelease = bookRelease;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public Book(int bookArticle, String bookName, int bookRelease, Book books) {
        this.bookArticle = bookArticle;
        this.bookName = bookName;
        this.bookRelease = bookRelease;
        this.books = books;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookArticle=" + bookArticle +
                ", bookName='" + bookName + '\'' +
                ", bookRelease=" + bookRelease +
                ", books=" + books +
                '}';
    }
}
