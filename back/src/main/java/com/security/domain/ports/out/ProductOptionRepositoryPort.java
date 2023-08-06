package com.security.domain.ports.out;

import com.security.domain.model.ProductOption;

import java.util.List;
import java.util.Optional;

public interface ProductOptionRepositoryPort {
    ProductOption save(ProductOption productOption);
    Optional<ProductOption> findById(Long id);
    List<ProductOption> findAll();
    Optional<ProductOption> update(ProductOption productOption);
    boolean deleteById(Long id);
}
