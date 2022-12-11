package Exercise.Exercise8.main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        Book book = Book.BookBuilder.anBook()
                .withTitle("I love JAVA")
                .withPublishedYear(new Date())
                .withNumberOfPages(new Integer(55))
                .withAuthors(List.of(new Author("Evelyn", "Li"), new Author("Merry", "Wang")))
                .withContent("Java is amazing.")
                .build();

        String xmlBook = BookParser.serialize(book, Format.XML);
        String jsonBook = BookParser.serialize(book, Format.JSON);

        LOG.info(xmlBook);
        LOG.info(jsonBook);

        String jsonStringBook = Files.readString(Paths.get("src/main/resources/book.json"));
        Book deserializedJsonBook = BookParser.deserialize(jsonStringBook, Format.JSON);
        LOG.info(deserializedJsonBook.toString());

        String xmlStringBook = Files.readString(Paths.get("src/main/resources/book.xml"));
        Book deserializedXmlBook = BookParser.deserialize(xmlStringBook, Format.XML);
        LOG.info(deserializedXmlBook.toString());
    }
}
