package com.security.domain.ports.out;

import com.security.domain.model.Option;

import java.util.List;
import java.util.Optional;

public interface OptionRepositoryPort {
    Option save(Option option);
    Optional<Option> findById(Long id);
    List<Option> findAll();
    Optional<Option> update(Option option);
    boolean deleteById(Long id);
}
