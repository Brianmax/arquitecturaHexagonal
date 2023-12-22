package com.example.repasoarqhexagonal.domain.ports.out;

import com.example.repasoarqhexagonal.domain.models.Author;

import java.util.Optional;

public interface AuthorOut {
    Author addAuthor(Author author);
    Optional<Author> getAuthor(Long id);
    Iterable<Author> getAuthors();
    Author updateAuthor(Author author, Long id);
    void deleteAuthor(Long id);
}
