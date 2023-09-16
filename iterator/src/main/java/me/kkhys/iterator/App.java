package me.kkhys.iterator;

import me.kkhys.iterator.book.Book;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var bookShelf = List.of(
                new Book("Around the World in 80 Days"),
                new Book("Bible"),
                new Book("Cinderella"),
                new Book("Daddy-Long-Legs"),
                new Book("East of Eden"),
                new Book("Frankenstein"),
                new Book("Gulliver's Travels"),
                new Book("Hamlet")
        );

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
