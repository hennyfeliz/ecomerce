package com.security.infraestructure.repository.impl;

import com.security.domain.model.Product;
import com.security.domain.ports.out.ProductRepositoryPort;
import com.security.infraestructure.repository.JpaProductRepository;
import com.security.infraestructure.entities.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaProductRepositoryAdapter implements ProductRepositoryPort {
    public final JpaProductRepository jpaProductRepository;

    public JpaProductRepositoryAdapter(JpaProductRepository jpaProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = ProductEntity.fromDomainModel(product);
        ProductEntity savedProduct = jpaProductRepository.save(productEntity);
        return savedProduct.toDomainModel();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return jpaProductRepository.findById(id)
                .map(ProductEntity::toDomainModel);
    }

    @Override
    public Optional<Product> findByName(String name) {
        return jpaProductRepository.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return jpaProductRepository.findAll().stream()
                .map(ProductEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Product> update(Product product) {
        if(jpaProductRepository.existsById(product.getId())){
            ProductEntity productEntity = ProductEntity.fromDomainModel(product);
            ProductEntity updatedProduct = jpaProductRepository.save(productEntity);
            return Optional.of(updatedProduct.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaProductRepository.existsById(id)){
            jpaProductRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
