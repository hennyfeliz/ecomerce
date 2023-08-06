package com.security.infraestructure.repository.impl;

import com.security.domain.model.ProductOption;
import com.security.domain.ports.out.ProductOptionRepositoryPort;
import com.security.infraestructure.repository.JpaProductOptionRepository;
import com.security.infraestructure.entities.ProductOptionEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaProductOptionRepositoryAdapter implements ProductOptionRepositoryPort {
    public final JpaProductOptionRepository jpaProductOptionRepository;

    public JpaProductOptionRepositoryAdapter(JpaProductOptionRepository jpaProductOptionRepository) {
        this.jpaProductOptionRepository = jpaProductOptionRepository;
    }

    @Override
    public ProductOption save(ProductOption productOption) {
        ProductOptionEntity productOptionEntity = ProductOptionEntity.fromDomainModel(productOption);
        ProductOptionEntity savedProductOption = jpaProductOptionRepository.save(productOptionEntity);
        return savedProductOption.toDomainModel();
    }

    @Override
    public Optional<ProductOption> findById(Long id) {
        return jpaProductOptionRepository.findById(id)
                .map(ProductOptionEntity::toDomainModel);
    }

    @Override
    public List<ProductOption> findAll() {
        return jpaProductOptionRepository.findAll().stream()
                .map(ProductOptionEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductOption> update(ProductOption productOption) {
        if(jpaProductOptionRepository.existsById(productOption.getId())){
            ProductOptionEntity productOptionEntity = ProductOptionEntity.fromDomainModel(productOption);
            ProductOptionEntity updatedProductOption = jpaProductOptionRepository.save(productOptionEntity);
            return Optional.of(updatedProductOption.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaProductOptionRepository.existsById(id)){
            jpaProductOptionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
