package _01_library;

public class LibraryRunner {
    public static void main(String[] args) {
       Library library = new Library();

       User user1 = new User("tem");
       User user2 = new User("bini");

       Movie movie1 = new Movie("title 1", "jonas", "123456");
       Movie movie2 = new Movie("title 2", "luwam", "123457");
       Movie movie3 = new Movie("title 3", "esrom", "123458");
       Movie movie4 = new Movie("title 4", "noah", "123459");

       // Adding movies to user
        System.out.println("Adding movies");
        library.addBook(user1, movie1);
        library.addBook(user1, movie2);
        library.listBorrowedMoviesByUser(user1);
        System.out.println();

        System.out.println("Adding movies");
        library.addBook(user2, movie3);
        library.addBook(user2, movie4);

        library.listBorrowedMoviesByUser(user2);
        System.out.println();
        System.out.println("Removing movies");
        System.out.println(movie3.getTitle());
        library.removeMovie(user2, movie3);
        library.listBorrowedMoviesByUser(user2);

        System.out.println();
        System.out.println("Removing movies");
        library.removeMovie(user2, movie1);
        library.listBorrowedMoviesByUser(user2);



    }
}
