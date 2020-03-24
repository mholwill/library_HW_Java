import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedCollection;

    public Borrower(){
        this.borrowedCollection = new ArrayList<Book>();
    }


    public int getCollection() {
        return this.borrowedCollection.size();
    }

    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.borrowedCollection.add(book);
    }

    public void giveBookBack(Book book, Library library) {
        this.borrowedCollection.remove(book);
        library.addBook(book);
    }
}
