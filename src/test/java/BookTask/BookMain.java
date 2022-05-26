package BookTask;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book(1, "First Book", 1999, new Book());
        Book book2 = new Book(2, "Second book", 2000, book1);
        Book book3 = new Book(3, "Third book", 2002, book2);
        Book book4 = new Book(4, "Forth book", 2004, book3);

        
    }
}