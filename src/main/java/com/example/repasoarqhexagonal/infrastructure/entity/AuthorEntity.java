package com.example.repasoarqhexagonal.infrastructure.entity;

import com.example.repasoarqhexagonal.domain.models.Author;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "author")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String email;

    public static AuthorEntity fromModel(Author author) {
        return new AuthorEntity(
                author.getId(),
                author.getName(),
                author.getLastName(),
                author.getEmail()
        );
    }
    public Author toModel() {
        return new Author(
                this.id,
                this.name,
                this.lastName,
                this.email
        );
    }
}
