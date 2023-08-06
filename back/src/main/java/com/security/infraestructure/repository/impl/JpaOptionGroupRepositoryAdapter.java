package com.security.infraestructure.repository.impl;

import com.security.domain.model.OptionGroup;
import com.security.domain.ports.out.OptionGroupRepositoryPort;
import com.security.infraestructure.repository.JpaOptionGroupRepository;
import com.security.infraestructure.entities.OptionGroupEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaOptionGroupRepositoryAdapter implements OptionGroupRepositoryPort {
    public final JpaOptionGroupRepository jpaOptionGroupRepository;

    public JpaOptionGroupRepositoryAdapter(JpaOptionGroupRepository jpaOptionGroupRepository) {
        this.jpaOptionGroupRepository = jpaOptionGroupRepository;
    }

    @Override
    public OptionGroup save(OptionGroup optionGroup) {
        OptionGroupEntity optionGroupEntity = OptionGroupEntity.fromDomainModel(optionGroup);
        OptionGroupEntity savedOptionGroup = jpaOptionGroupRepository.save(optionGroupEntity);
        return savedOptionGroup.toDomainModel();
    }

    @Override
    public Optional<OptionGroup> findById(Long id) {
        return jpaOptionGroupRepository.findById(id)
                .map(OptionGroupEntity::toDomainModel);
    }

    @Override
    public List<OptionGroup> findAll() {
        return jpaOptionGroupRepository.findAll().stream()
                .map(OptionGroupEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<OptionGroup> update(OptionGroup optionGroup) {
        if(jpaOptionGroupRepository.existsById(optionGroup.getId())){
            OptionGroupEntity optionGroupEntity = OptionGroupEntity.fromDomainModel(optionGroup);
            OptionGroupEntity updatedOptionGroup = jpaOptionGroupRepository.save(optionGroupEntity);
            return Optional.of(updatedOptionGroup.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaOptionGroupRepository.existsById(id)){
            jpaOptionGroupRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
