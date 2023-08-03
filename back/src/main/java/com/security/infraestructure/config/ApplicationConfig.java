package com.security.infraestructure.config;

import com.security.application.service.UserService;
import com.security.application.usecase.UserUseCaseImpl;
import com.security.domain.ports.out.UserRepositoryPort;
import com.security.infraestructure.repository.impl.JpaUserRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    // users beans config

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(new UserUseCaseImpl(userRepositoryPort));
    }

    @Bean
    public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter){
        return jpaUserRepositoryAdapter;
    }
}
