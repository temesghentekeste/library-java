import java.util.Set;

public class User {
    /*

    Create a class User that contains:

name (String)
borrowedBooks (Set<Book>)

     */
    private String name;
    private Set<Book> borrowedBooks;

    public User(String name, Set<Book> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Set<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
