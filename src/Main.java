import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Book book1 = new Book("title1", "aaa", "12345");
        Book book2 = new Book("title2", "bbb", "12346");
        Book book3 = new Book("title3", "ccc", "12347");
        Book book4 = new Book("title4", "ccc", "12348");

        library.addBook(user1, book1);
        library.addBook(user1, book2);
        library.addBook(user1, book3);

        library.addBook(user2, book4);

        Set<Book> books = library.getUserBorrowedBooks(user1);

        System.out.println(books);

        System.out.println(user2.getBorrowedBooks());

        library.removeBook(user2, book4);
        System.out.println(user2.getBorrowedBooks());
    }
}