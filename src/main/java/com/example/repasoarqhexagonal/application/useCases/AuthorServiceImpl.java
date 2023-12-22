package com.example.repasoarqhexagonal.application.useCases;

import com.example.repasoarqhexagonal.domain.models.Author;
import com.example.repasoarqhexagonal.domain.ports.in.AuthorIn;
import com.example.repasoarqhexagonal.domain.ports.out.AuthorOut;

import java.util.Optional;

public class AuthorServiceImpl implements AuthorIn {
    private AuthorOut authorOut;
    public AuthorServiceImpl(AuthorOut authorOut) {
        this.authorOut = authorOut;
    }

    @Override
    public Author addAuthor(Author author) {
        return authorOut.addAuthor(author);
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        return authorOut.getAuthor(id);
    }

    @Override
    public Iterable<Author> getAuthors() {
        return authorOut.getAuthors();
    }

    @Override
    public Author updateAuthor(Author author, Long id) {
        return authorOut.updateAuthor(author, id);
    }

    @Override
    public void deleteAuthor(Long id) {
        authorOut.deleteAuthor(id);
    }
}
