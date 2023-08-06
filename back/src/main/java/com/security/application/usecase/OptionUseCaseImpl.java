package com.security.application.usecase;

import com.security.domain.model.Option;
import com.security.domain.ports.in.OptionUseCase;
import com.security.domain.ports.out.OptionRepositoryPort;

import java.util.List;
import java.util.Optional;

public class OptionUseCaseImpl implements OptionUseCase {
    public final OptionRepositoryPort optionRepositoryPort;

    public OptionUseCaseImpl(OptionRepositoryPort optionRepositoryPort) {
        this.optionRepositoryPort = optionRepositoryPort;
    }

    @Override
    public Option createOption(Option option) {
        return optionRepositoryPort.save(option);
    }

    @Override
    public Optional<Option> getOptionById(Long id) {
        return optionRepositoryPort.findById(id);
    }

    @Override
    public List<Option> getAllOptions() {
        return optionRepositoryPort.findAll();
    }

    @Override
    public Optional<Option> updateOption(Long id, Option option) {
        return optionRepositoryPort.update(option);
    }

    @Override
    public boolean deleteOption(Long id) {
        return optionRepositoryPort.deleteById(id);
    }
}
