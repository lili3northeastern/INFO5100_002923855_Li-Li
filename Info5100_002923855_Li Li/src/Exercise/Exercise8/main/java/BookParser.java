package Exercise.Exercise8.main.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.text.SimpleDateFormat;

public class BookParser {

    private static final ObjectMapper XML_MAPPER = new XmlMapper();
    private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        XML_MAPPER.setDateFormat(simpleDateFormat);
        JSON_MAPPER.setDateFormat(simpleDateFormat);
    }

    public static String serialize(Book book, Format format) {
        return format.equals(Format.JSON) ? serialize(book, JSON_MAPPER) : serialize(book, XML_MAPPER);
    }

    private static String serialize(Book book, ObjectMapper objectMapper) {
        try {
            return objectMapper.writeValueAsString(book);
        } catch (IOException e) {
            throw new UncheckedIOException("Oh no!", e);
        }
    }

    public static Book deserialize(String book, Format format) {
        return format.equals(Format.JSON) ? deserialize(book, JSON_MAPPER) : deserialize(book, XML_MAPPER);
    }

    private static Book deserialize(String book, ObjectMapper objectMapper) {
        try {
            return objectMapper.readValue(book, Book.class);
        } catch (JsonProcessingException e) {
            throw new UncheckedIOException("Bad!", e);
        }
    }

}
