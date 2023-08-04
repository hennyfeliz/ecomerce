package com.security.domain.ports.in;

import com.security.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductUseCase {
    Product createProduct(Product product);
    Optional<Product> getProductById(Long id);
    Optional<Product> getProductByName(String name);
    List<Product> getAllProducts();
    Optional<Product> updateProduct(Long id, Product product);
    boolean deleteProduct(Long id);
}
