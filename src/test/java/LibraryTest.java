import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;


    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Title 1", "MC", "Horror");
        book2 = new Book("Title 2", "HEHEHE", "RomCom");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.getBooks());
    }

    @Test
    public void hasCapacity(){
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getBooks());
    }

    @Test
    public void checkCapacityAfterBookAdded(){
        library.addBook(book1);
        assertEquals(1, library.getCapacity());
    }


    @Test
    public void checkNoCapacityLeft(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        assertEquals(false, library.hasCapacity());
    }

    @Test
    public void checkCanRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook();
        assertEquals(1, library.getBooks());
    }

}
