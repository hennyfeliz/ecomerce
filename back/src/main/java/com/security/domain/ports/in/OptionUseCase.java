package com.security.domain.ports.in;

import com.security.domain.model.Option;

import java.util.List;
import java.util.Optional;

public interface OptionUseCase {
    Option createOption(Option option);
    Optional<Option> getOptionById(Long id);
    List<Option> getAllOptions();
    Optional<Option> updateOption(Long id, Option option);
    boolean deleteOption(Long id);
}
