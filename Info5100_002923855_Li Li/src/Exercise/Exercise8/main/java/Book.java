package Exercise.Exercise8.main.java;

import Exercise.Exercise8.main.java.Author;
import Exercise.Exercise8.main.java.CustomDeserializer;
import Exercise.Exercise8.main.java.CustomSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;
import java.util.List;

@JacksonXmlRootElement(localName = "book")
public class Book {

    @JsonProperty
    private String title;

    @JsonProperty
    private Date publishedYear;

    @JsonProperty
    private int numberOfPages;

    @JsonProperty
    @JacksonXmlElementWrapper(localName = "authors")
    @JacksonXmlProperty(localName = "author")
    private List<Author> authors;

    @JsonProperty
    @JsonSerialize(using = CustomSerializer.class)
    private String content;


    @Override
    public String toString() {
        return "com.Book{" +
                "title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                ", numberOfPages=" + numberOfPages +
                ", authors=" + authors +
                ", content='" + content + '\'' +
                '}';
    }

    public static final class BookBuilder {
        private String title;
        private Date publishedYear;
        private int numberOfPages;
        private List<Author> authors;
        private String content;

        private BookBuilder() {
        }

        public static BookBuilder anBook() {
            return new BookBuilder();
        }

        public BookBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder withPublishedYear(Date publishedYear) {
            this.publishedYear = publishedYear;
            return this;
        }

        public BookBuilder withNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public BookBuilder withAuthors(List<Author> authors) {
            this.authors = authors;
            return this;
        }

        public BookBuilder withContent(String content) {
            this.content = content;
            return this;
        }


        public Book build() {
            Book book = new Book();
            book.content = this.content;
            book.title = this.title;
            book.numberOfPages = this.numberOfPages;
            book.authors = this.authors;
            book.publishedYear = this.publishedYear;
            return book;
        }
    }
}