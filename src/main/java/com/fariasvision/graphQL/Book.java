package com.fariasvision.graphQL;

import java.util.Arrays;
import java.util.List;

public record Book(
        Integer id,
        String name,
        Integer pageCount
) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Jean-Michel Basquiat. 40th Ed.", 604),
            new Book(2, "Pharrell-Isms: 13", 300),
            new Book(3, "Virgil Abloh. Icons", 344),
            new Book(4, "Abloh-Isms: 6", 233)
    );

    public static Book getBookById(Integer id) {
        return books.stream().filter(book -> book.id.equals(id))
                .findFirst()
                .orElse(null);
    }
}
