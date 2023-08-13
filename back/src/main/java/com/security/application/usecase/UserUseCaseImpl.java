package com.security.application.usecase;

import com.security.domain.model.User;
import com.security.domain.ports.in.UserUseCase;
import com.security.domain.ports.out.UserRepositoryPort;

import java.util.List;
import java.util.Optional;

public class UserUseCaseImpl implements UserUseCase {
    public final UserRepositoryPort userRepositoryPort;

    public UserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepositoryPort.findById(id);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepositoryPort.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryPort.findAll();
    }

    @Override
    public Optional<User> updateUser(Long id, User user) {
        return userRepositoryPort.update(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepositoryPort.deleteById(id);
    }
}
