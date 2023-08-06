package com.security.application.service;

import com.security.domain.model.Option;
import com.security.domain.ports.in.OptionUseCase;

import java.util.List;
import java.util.Optional;

public class OptionService implements OptionUseCase {
    public final OptionUseCase optionUseCase;

    public OptionService(OptionUseCase optionUseCase) {
        this.optionUseCase = optionUseCase;
    }

    @Override
    public Option createOption(Option option) {
        return optionUseCase.createOption(option);
    }

    @Override
    public Optional<Option> getOptionById(Long id) {
        return optionUseCase.getOptionById(id);
    }


    @Override
    public List<Option> getAllOptions() {
        return optionUseCase.getAllOptions();
    }

    @Override
    public Optional<Option> updateOption(Long id, Option option) {
        return optionUseCase.updateOption(id, option);
    }

    @Override
    public boolean deleteOption(Long id) {
        return optionUseCase.deleteOption(id);
    }
}
