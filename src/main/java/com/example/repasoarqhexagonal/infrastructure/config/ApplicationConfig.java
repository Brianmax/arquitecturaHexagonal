package com.example.repasoarqhexagonal.infrastructure.config;

import com.example.repasoarqhexagonal.application.service.AuthorService;
import com.example.repasoarqhexagonal.application.useCases.AuthorServiceImpl;
import com.example.repasoarqhexagonal.domain.ports.in.AuthorIn;
import com.example.repasoarqhexagonal.domain.ports.out.AuthorOut;
import com.example.repasoarqhexagonal.infrastructure.repository.AuthorJpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public AuthorService authorService(AuthorOut authorOut) {
        return new AuthorService(new AuthorServiceImpl(authorOut));
    }
    @Bean
    public AuthorOut authorOut(AuthorJpaRepositoryAdapter authorJpaRepositoryAdapter) {
        return authorJpaRepositoryAdapter;
    }
}
