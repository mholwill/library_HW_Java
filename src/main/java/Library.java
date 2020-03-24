import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }


    public int getBooks() {
        return this.collection.size();
    }

    public boolean hasCapacity() {
        return this.capacity > 0;
    }


    public void addBook(Book book) {
        if (hasCapacity() == true) {
            this.collection.add(book);
            this.capacity -= 1;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
