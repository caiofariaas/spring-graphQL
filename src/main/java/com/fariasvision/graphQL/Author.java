package com.fariasvision.graphQL;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(
        Integer id,
        String name
) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Caio Farias"),
            new Author(2, "Julya Jacometti"),
            new Author(3, "Allah")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(author -> author.id.equals(id))
                .findFirst();
    }
}
