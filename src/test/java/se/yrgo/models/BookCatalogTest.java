package se.yrgo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        Book book2 = new Book(3, "Old man and the sea", "Hemmingway", "233436364563", "gg", 237);
        bc.addBook(book2);
        assertNotEquals(book2, bc.getBookArray()[0]);
        assertEquals(book2, bc.getBookArray()[1]);
    }

    //G
    @Test
    public void testFindBook() {

    }

    //G
    @Test
    public void testFindBookIgnoringCase() {

    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {

    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {

    }

}
