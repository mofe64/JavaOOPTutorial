package nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User customer = new Customer("Tim", "Mothy");
    User admin = new Librarian("Paul", "Mark");
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void userShouldBeAbleToGetFirstNameAndLastName(){
        assertEquals("Tim", customer.getFirstName());
        assertEquals("Mothy", customer.getLastName());
        assertEquals("Paul", admin.getFirstName());
        assertEquals("Mark", admin.getLastName());
    }
}