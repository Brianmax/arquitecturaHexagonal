package com.example.repasoarqhexagonal.infrastructure.controller;

import com.example.repasoarqhexagonal.application.service.AuthorService;
import com.example.repasoarqhexagonal.domain.models.Author;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {
    private final AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
    @GetMapping("/getAuthor/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getAuthor(id).orElse(null);
    }
    @PutMapping("/updateAuthor/{id}")
    public Author updateAuthor(@RequestBody Author author, @PathVariable Long id) {
        return authorService.updateAuthor(author, id);
    }
}
