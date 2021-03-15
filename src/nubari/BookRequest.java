package nubari;

import java.time.LocalDate;

public class BookRequest {
    private String bookTitle;
    private String authorName;
    private LocalDate publishDate;
    private boolean status;
    public BookRequest(String bookTitle, String authorName){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        status = false;
    }
    public BookRequest(String bookTitle, String authorName,
                       LocalDate publishDate) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publishDate = publishDate;
        this.status = false;
    }

}
