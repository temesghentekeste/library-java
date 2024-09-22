package _01_library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
       Create a class Library that contains:
           A Map<User, Set<Book>> to track which users have borrowed which books.
           A Map<User, Set<Book>> to track which users have borrowed which books.
           Features to Implement:
           -Add a Book: Allow the library to add a book to a user's borrowed list.
           -Remove a Book: Allow the library to remove a book from a user's borrowed list.
           -List User's Borrowed Books: Given a user, list all the books they have borrowed.
    */
public class Library {
    Map<User, Set<Movie>> movieTracker;

    public Library() {
        movieTracker = new HashMap<>();
    }

    public Library(Map<User, Set<Movie>> movieTracker) {
        this.movieTracker = movieTracker;
    }

    public void addBook(User user, Movie movie) {

        if(!movieTracker.containsKey(user)) {
           movieTracker.put(user, new HashSet<>());
        }

        movieTracker.get(user).add(movie);
    }

    public void removeMovie(User user, Movie movieToRemove) {
        if(movieTracker.containsKey(user)) {
            for (Movie movie : movieTracker.get(user)) {
                if( movie.equals(movieToRemove)) {
                    movieTracker.get(user).remove(movieToRemove);
                    return;
                }
            }
            System.out.println(user.getName() + " doesn't have a movie titled '" + movieToRemove.getTitle() + "' to track");
        } else {
            System.out.println(user.getName() + " doesn't have movies to track");
        }
    }

    public void listBorrowedMoviesByUser(User user) {
        System.out.println("Movies currently tracked by: " + user.getName());
        if(movieTracker.containsKey(user)) {
            for (Movie movie : movieTracker.get(user)) {
                System.out.println(movie);
            }
        }
    }


}
