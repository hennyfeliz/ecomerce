package com.security.domain.ports.in;

import com.security.domain.model.OptionGroup;

import java.util.List;
import java.util.Optional;

public interface OptionGroupUseCase {
    OptionGroup createOptionGroup(OptionGroup optionGroup);
    Optional<OptionGroup> getOptionGroupById(Long id);
    List<OptionGroup> getAllOptionGroups();
    Optional<OptionGroup> updateOptionGroup(Long id, OptionGroup optionGroup);
    boolean deleteOptionGroup(Long id);
}
