package com.security.infraestructure.repository.impl;

import com.security.domain.model.Option;
import com.security.domain.ports.out.OptionRepositoryPort;
import com.security.infraestructure.repository.JpaOptionRepository;
import com.security.infraestructure.entities.OptionEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaOptionRepositoryAdapter implements OptionRepositoryPort {
    public final JpaOptionRepository jpaOptionRepository;

    public JpaOptionRepositoryAdapter(JpaOptionRepository jpaOptionRepository) {
        this.jpaOptionRepository = jpaOptionRepository;
    }

    @Override
    public Option save(Option option) {
        OptionEntity optionEntity = OptionEntity.fromDomainModel(option);
        OptionEntity savedOption = jpaOptionRepository.save(optionEntity);
        return savedOption.toDomainModel();
    }

    @Override
    public Optional<Option> findById(Long id) {
        return jpaOptionRepository.findById(id)
                .map(OptionEntity::toDomainModel);
    }

    @Override
    public List<Option> findAll() {
        return jpaOptionRepository.findAll().stream()
                .map(OptionEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Option> update(Option option) {
        if(jpaOptionRepository.existsById(option.getId())){
            OptionEntity optionEntity = OptionEntity.fromDomainModel(option);
            OptionEntity updatedOption = jpaOptionRepository.save(optionEntity);
            return Optional.of(updatedOption.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaOptionRepository.existsById(id)){
            jpaOptionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
