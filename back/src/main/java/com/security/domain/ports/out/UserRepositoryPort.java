package com.security.domain.ports.out;

import com.security.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    Optional<User> update(User user);
    boolean deleteById(Long id);
}
