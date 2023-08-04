package com.security.infraestructure.repository.impl;

import com.security.domain.model.ProductCategory;
import com.security.domain.ports.out.ProductCategoryRepositoryPort;
import com.security.infraestructure.repository.JpaProductCategoryRepository;
import com.security.infraestructure.entities.ProductCategoryEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaProductCategoryRepositoryAdapter implements ProductCategoryRepositoryPort {
    public final JpaProductCategoryRepository jpaProductCategoryRepository;

    public JpaProductCategoryRepositoryAdapter(JpaProductCategoryRepository jpaProductCategoryRepository) {
        this.jpaProductCategoryRepository = jpaProductCategoryRepository;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        ProductCategoryEntity productCategoryEntity = ProductCategoryEntity.fromDomainModel(productCategory);
        ProductCategoryEntity savedProductCategory = jpaProductCategoryRepository.save(productCategoryEntity);
        return savedProductCategory.toDomainModel();
    }

    @Override
    public Optional<ProductCategory> findById(Long id) {
        return jpaProductCategoryRepository.findById(id)
                .map(ProductCategoryEntity::toDomainModel);
    }

    @Override
    public Optional<ProductCategory> findByName(String name) {
        return jpaProductCategoryRepository.findByName(name);
    }

    @Override
    public List<ProductCategory> findAll() {
        return jpaProductCategoryRepository.findAll().stream()
                .map(ProductCategoryEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductCategory> update(ProductCategory productCategory) {
        if(jpaProductCategoryRepository.existsById(productCategory.getId())){
            ProductCategoryEntity productCategoryEntity = ProductCategoryEntity.fromDomainModel(productCategory);
            ProductCategoryEntity updatedProductCategory = jpaProductCategoryRepository.save(productCategoryEntity);
            return Optional.of(updatedProductCategory.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaProductCategoryRepository.existsById(id)){
            jpaProductCategoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
