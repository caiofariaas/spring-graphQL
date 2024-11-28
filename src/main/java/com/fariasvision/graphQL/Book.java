package com.fariasvision.graphQL;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(
        Integer id,
        String name,
        Integer pageCount,
        Integer authorId
) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Jean-Michel Basquiat. 40th Ed.", 604, 3),
            new Book(2, "Pharrell-Isms: 13", 300, 2),
            new Book(3, "Virgil Abloh. Icons", 344, 1),
            new Book(4, "Abloh-Isms: 6", 233, 2)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream().filter(book -> book.id.equals(id))
                .findFirst();
    }
}
