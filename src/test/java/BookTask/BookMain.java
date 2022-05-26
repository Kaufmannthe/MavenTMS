package BookTask;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.*;

public class BookMain {
    public static void main(String[] args) throws JAXBException, IOException {

        Book book1 = new Book(1, "First Book", 1999, new Book());
        Book book2 = new Book(2, "Second book", 2000, book1);
        Book book3 = new Book(3, "Third book", 2002, book2);
        Book book4 = new Book(4, "Forth book", 2004, book3);

        Book[] books = {book1,book2,book3,book4};

        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);  //Initializing JAXB

        Marshaller marshaller = jaxbContext.createMarshaller();     //Marshaller initializing

        String output = "/home/Kaufmannthe/IdeaProjects/MavenTMS/src/test/java/BookTask/books.xml";

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);  //Ladder output

        for(Book book : books) {
            marshaller.marshal(book, new FileWriter(output,true));  //Marshalling Objects to XML
        }
        System.out.println("Done");

    }
}