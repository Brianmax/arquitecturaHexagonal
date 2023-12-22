package com.example.repasoarqhexagonal.infrastructure.repository;

import com.example.repasoarqhexagonal.domain.models.Author;
import com.example.repasoarqhexagonal.domain.ports.out.AuthorOut;
import com.example.repasoarqhexagonal.infrastructure.entity.AuthorEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class AuthorJpaRepositoryAdapter implements AuthorOut {
    AuthorJpaRepository authorJpaRepository;
    public AuthorJpaRepositoryAdapter(AuthorJpaRepository authorJpaRepository) {
        this.authorJpaRepository = authorJpaRepository;
    }
    @Override
    public Author addAuthor(Author author) {
        AuthorEntity authorEntity = AuthorEntity.fromModel(author);
        return authorJpaRepository.save(authorEntity).toModel();
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        Optional<AuthorEntity> authorEntity = authorJpaRepository.findById(id);
        if (authorEntity.isPresent()) {
            return Optional.of(authorEntity.get().toModel());
        }
        return Optional.empty();
    }

    @Override
    public Iterable<Author> getAuthors() {
        List<AuthorEntity> authors = authorJpaRepository.findAll();
        List<Author> authorsModel = new ArrayList<>();
        for(AuthorEntity authorEntity : authors) {
            authorsModel.add(authorEntity.toModel());
        }
        return authorsModel;
    }

    @Override
    public Author updateAuthor(Author author, Long id) {
        Optional<AuthorEntity> authorEntity = authorJpaRepository.findById(id);
        if (authorEntity.isPresent()) {
            AuthorEntity authorEntity1 = authorEntity.get();
            authorEntity1.setName(author.getName());
            authorEntity1.setLastName(author.getLastName());
            authorEntity1.setEmail(author.getEmail());
            return authorJpaRepository.save(authorEntity1).toModel();
        }
        return null;
    }

    @Override
    public void deleteAuthor(Long id) {

    }
}
