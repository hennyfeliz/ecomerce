package com.security.infraestructure.repository.impl;

import com.security.domain.model.User;
import com.security.domain.ports.out.UserRepositoryPort;
import com.security.infraestructure.repository.JpaUserRepository;
import com.security.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort {
    public final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        UserEntity savedUser = jpaUserRepository.save(userEntity);
        return savedUser.toDomainModel();
    }

    @Override
    public Optional<User> findById(Long id) {
        return jpaUserRepository.findById(id)
                .map(UserEntity::toDomainModel);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaUserRepository.findByEmail(email)
                .map(UserEntity::toDomainModel);
    }

    @Override
    public List<User> findAll() {
        return jpaUserRepository.findAll().stream()
                .map(UserEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<User> update(User user) {
        if(jpaUserRepository.existsById(user.getId())){
            UserEntity userEntity = UserEntity.fromDomainModel(user);
            UserEntity updatedUser = jpaUserRepository.save(userEntity);
            return Optional.of(updatedUser.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaUserRepository.existsById(id)){
            jpaUserRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
