import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book1 = new Book("Title 1", "MC", "Horror");
        book2 = new Book("Title 2", "HEHEHE", "RomCom");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void checkEmptyCollection(){
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void checkBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.getCollection());
    }

    @Test
    public void checkGiveBookBack(){
        borrower.borrowBook(library);
        borrower.giveBookBack(book1, library);
        assertEquals(0, borrower.getCollection());
        assertEquals(2, library.getBooks());
    }

}

