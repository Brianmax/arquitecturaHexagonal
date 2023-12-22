package com.example.repasoarqhexagonal.application.service;

import com.example.repasoarqhexagonal.domain.models.Author;
import com.example.repasoarqhexagonal.domain.ports.in.AuthorIn;

import java.util.Optional;

public class AuthorService implements AuthorIn {
    private final AuthorIn authorIn; // author service impl
    public AuthorService(AuthorIn authorIn) {
        this.authorIn = authorIn;
    }
    @Override
    public Author addAuthor(Author author) {
        return authorIn.addAuthor(author);
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        return authorIn.getAuthor(id);
    }

    @Override
    public Iterable<Author> getAuthors() {
        return authorIn.getAuthors();
    }

    @Override
    public Author updateAuthor(Author author, Long id) {
        return authorIn.updateAuthor(author, id);
    }

    @Override
    public void deleteAuthor(Long id) {
        authorIn.deleteAuthor(id);
    }
}
