package com.security.application.usecase;

import com.security.domain.model.OptionGroup;
import com.security.domain.ports.in.OptionGroupUseCase;
import com.security.domain.ports.out.OptionGroupRepositoryPort;

import java.util.List;
import java.util.Optional;

public class OptionGroupUseCaseImpl implements OptionGroupUseCase {
    public final OptionGroupRepositoryPort optionGroupRepositoryPort;

    public OptionGroupUseCaseImpl(OptionGroupRepositoryPort optionGroupRepositoryPort) {
        this.optionGroupRepositoryPort = optionGroupRepositoryPort;
    }

    @Override
    public OptionGroup createOptionGroup(OptionGroup optionGroup) {
        return optionGroupRepositoryPort.save(optionGroup);
    }

    @Override
    public Optional<OptionGroup> getOptionGroupById(Long id) {
        return optionGroupRepositoryPort.findById(id);
    }

    @Override
    public List<OptionGroup> getAllOptionGroups() {
        return optionGroupRepositoryPort.findAll();
    }

    @Override
    public Optional<OptionGroup> updateOptionGroup(Long id, OptionGroup optionGroup) {
        return optionGroupRepositoryPort.update(optionGroup);
    }

    @Override
    public boolean deleteOptionGroup(Long id) {
        return optionGroupRepositoryPort.deleteById(id);
    }
}
