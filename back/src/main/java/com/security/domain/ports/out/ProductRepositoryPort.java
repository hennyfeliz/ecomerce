package com.security.domain.ports.out;

import com.security.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryPort {
    Product save(Product product);
    Optional<Product> findById(Long id);
    Optional<Product> findByName(String name);
    List<Product> findAll();
    Optional<Product> update(Product product);
    boolean deleteById(Long id);
}
