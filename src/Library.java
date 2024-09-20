import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    /*
    Create a class Library that contains:
    A Map<User, Set<Book>> to track which users have borrowed which books.
    A Map<User, Set<Book>> to track which users have borrowed which books.
Features to Implement:
-Add a Book: Allow the library to add a book to a user's borrowed list.
-Remove a Book: Allow the library to remove a book from a user's borrowed list.
-List User's Borrowed Books: Given a user, list all the books they have borrowed.
     */
    Map<User, Set<Book>> borrowedBooks;

    public Library() {
        borrowedBooks = new HashMap<>();
    }

    public Library(Map<User, Set<Book>> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBook(User user, Book book) {
        if(!borrowedBooks.containsKey(user)) {
            borrowedBooks.put(user, new HashSet<>());
        }
        borrowedBooks.get(user).add(book);
    }

    public void removeBook(User user, Book book) {
        if (borrowedBooks.containsKey(user)) {
            Set<Book> books = borrowedBooks.get(user);
            books.remove(book);
        }
    }


}
