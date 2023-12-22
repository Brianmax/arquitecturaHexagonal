package com.example.repasoarqhexagonal.infrastructure.repository;

import com.example.repasoarqhexagonal.domain.models.Author;
import com.example.repasoarqhexagonal.infrastructure.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


public interface AuthorJpaRepository extends JpaRepository<AuthorEntity, Long> {
}
