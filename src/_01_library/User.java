package _01_library;

import java.util.HashSet;
import java.util.Set;

/*

  Create a class User that contains:

        name (String)
        borrowedBooks (Set<Book>)

   */
public class User {
    private String name;
    Set<Movie> borrowedBooks;

    public User(String name) {
        this.name = name;
        borrowedBooks = new HashSet<>();
    }

    public User(String name, Set<Movie> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Set<Movie> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
