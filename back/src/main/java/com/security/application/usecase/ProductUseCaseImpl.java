package com.security.application.usecase;

import com.security.domain.model.Product;
import com.security.domain.ports.in.ProductUseCase;
import com.security.domain.ports.out.ProductRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ProductUseCaseImpl implements ProductUseCase {
    public final ProductRepositoryPort productRepositoryPort;

    public ProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepositoryPort.save(product);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepositoryPort.findById(id);
    }

    @Override
    public Optional<Product> getProductByName(String name) {
        return productRepositoryPort.findByName(name);
    }


    @Override
    public List<Product> getAllProducts() {
        return productRepositoryPort.findAll();
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product product) {
        return productRepositoryPort.update(product);
    }

    @Override
    public boolean deleteProduct(Long id) {
        return productRepositoryPort.deleteById(id);
    }
}
