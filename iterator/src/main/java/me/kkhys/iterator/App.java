package me.kkhys.iterator;

import me.kkhys.iterator.book.Book;
import me.kkhys.iterator.book.BookShelf;

public class App {
    public static void main(String[] args) {
        var bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        var iterator = bookShelf.iterator();

        // How to use Iterator explicitly
        while (iterator.hasNext()) {
            var book = iterator.next();
            System.out.println(book.name());
        }

        System.out.println("-----");

        for (var book : bookShelf) {
            System.out.println(book.name());
        }
    }
}
