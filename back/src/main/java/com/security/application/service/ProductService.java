package com.security.application.service;

import com.security.domain.model.Product;
import com.security.domain.ports.in.ProductUseCase;

import java.util.List;
import java.util.Optional;

public class ProductService implements ProductUseCase {
    public final ProductUseCase productUseCase;

    public ProductService(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @Override
    public Product createProduct(Product product) {
        return productUseCase.createProduct(product);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productUseCase.getProductById(id);
    }

    @Override
    public Optional<Product> getProductByName(String name) {
        return productUseCase.getProductByName(name);
    }


    @Override
    public List<Product> getAllProducts() {
        return productUseCase.getAllProducts();
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product product) {
        return productUseCase.updateProduct(id, product);
    }

    @Override
    public boolean deleteProduct(Long id) {
        return productUseCase.deleteProduct(id);
    }
}
