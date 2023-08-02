package com.security.domain.ports.in;

import com.security.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserUseCase {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByEmail(String email);
    List<User> getAllUsers();
    Optional<User> updateUser(Long id, User user);
    boolean deleteUser(Long id);
}
