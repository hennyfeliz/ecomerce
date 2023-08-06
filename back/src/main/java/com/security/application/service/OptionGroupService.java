package com.security.application.service;

import com.security.domain.model.OptionGroup;
import com.security.domain.ports.in.OptionGroupUseCase;

import java.util.List;
import java.util.Optional;

public class OptionGroupService implements OptionGroupUseCase {
    public final OptionGroupUseCase optionGroupUseCase;

    public OptionGroupService(OptionGroupUseCase optionGroupUseCase) {
        this.optionGroupUseCase = optionGroupUseCase;
    }

    @Override
    public OptionGroup createOptionGroup(OptionGroup optionGroup) {
        return optionGroupUseCase.createOptionGroup(optionGroup);
    }

    @Override
    public Optional<OptionGroup> getOptionGroupById(Long id) {
        return optionGroupUseCase.getOptionGroupById(id);
    }


    @Override
    public List<OptionGroup> getAllOptionGroups() {
        return optionGroupUseCase.getAllOptionGroups();
    }

    @Override
    public Optional<OptionGroup> updateOptionGroup(Long id, OptionGroup optionGroup) {
        return optionGroupUseCase.updateOptionGroup(id, optionGroup);
    }

    @Override
    public boolean deleteOptionGroup(Long id) {
        return optionGroupUseCase.deleteOptionGroup(id);
    }
}
