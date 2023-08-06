package com.security.domain.ports.out;

import com.security.domain.model.OptionGroup;

import java.util.List;
import java.util.Optional;

public interface OptionGroupRepositoryPort {
    OptionGroup save(OptionGroup optionGroup);
    Optional<OptionGroup> findById(Long id);
    List<OptionGroup> findAll();
    Optional<OptionGroup> update(OptionGroup optionGroup);
    boolean deleteById(Long id);
}
