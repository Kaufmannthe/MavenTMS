package BookTask;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(name = "book")
public class Book {
    private int bookArticle;
    private String bookName;
    private int bookRelease;

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

    public Book(int bookArticle, String bookName, int bookRelease, Book books) {
        this.bookArticle = bookArticle;
        this.bookName = bookName;
        this.bookRelease = bookRelease;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookArticle=" + bookArticle +
                ", bookName='" + bookName + '\'' +
                ", bookRelease=" + bookRelease +
                '}';
    }
}
