package nubari;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Author {
    private String firstname;
    private String lastname;
    private List<Book> books;

    public Author(String firstname,Book book){
        this.firstname = firstname;
        books = new ArrayList<>();
        books.add(book);
    }

    public String getFirstName() {
        return firstname;
    }

    public List<Book> getBooks() {
        return books;
    }
}
