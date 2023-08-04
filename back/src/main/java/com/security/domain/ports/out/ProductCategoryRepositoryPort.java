package com.security.domain.ports.out;

import com.security.domain.model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryRepositoryPort {
    ProductCategory save(ProductCategory productCategory);
    Optional<ProductCategory> findById(Long id);
    Optional<ProductCategory> findByName(String name);
    List<ProductCategory> findAll();
    Optional<ProductCategory> update(ProductCategory productCategory);
    boolean deleteById(Long id);
}
