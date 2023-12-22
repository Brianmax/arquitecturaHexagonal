package com.example.repasoarqhexagonal.domain.ports.in;

import com.example.repasoarqhexagonal.domain.models.Author;

import java.util.Optional;

public interface AuthorIn {
    Author addAuthor(Author author);
    Optional<Author> getAuthor(Long id);
    Iterable<Author> getAuthors();
    Author updateAuthor(Author author, Long id);
    void deleteAuthor(Long id);
}
