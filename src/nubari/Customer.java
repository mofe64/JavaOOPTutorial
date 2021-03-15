package nubari;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    List<CardDetails> customerCards;
    List<BookRequest> bookRequests;
    public Customer(String firstName, String lastName){
        super(firstName, lastName);
        bookRequests = new ArrayList<>();
        customerCards = new ArrayList<>();
    }

    public Customer(String firstName, String lastName, LocalDate
                    expiryDate, String cardNumber){
        super(firstName, lastName);
        bookRequests = new ArrayList<>();
        String name = firstName + " " + lastName;
        CardDetails cardDetails = new CardDetails(name,cardNumber,
                expiryDate);
        customerCards = new ArrayList<>();
        customerCards.add(cardDetails);
    }


    public void makeRequest(String bookTitle, String authorName){
        BookRequest bookRequest = new BookRequest(bookTitle, authorName);
        bookRequests.add(bookRequest);
    }

    public void makeRequest(String bookTitle, String authorName,
                            LocalDate publishDate) {
        BookRequest bookRequest = new BookRequest(bookTitle, authorName,
                publishDate);
        bookRequests.add(bookRequest);
    }

    public List<BookRequest> getRequests() {
        return bookRequests;
    }

    public void addCustomerDetails(String name,
                                   String cardNumber,
                                   LocalDate expiryDate){

        CardDetails cardDetails = new CardDetails(name,cardNumber,
                expiryDate);
        customerCards.add(cardDetails);
    }


}


