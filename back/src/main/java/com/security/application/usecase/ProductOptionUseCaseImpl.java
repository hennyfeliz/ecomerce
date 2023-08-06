package com.security.application.usecase;

import com.security.domain.model.ProductOption;
import com.security.domain.ports.in.ProductOptionUseCase;
import com.security.domain.ports.out.ProductOptionRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ProductOptionUseCaseImpl implements ProductOptionUseCase {
    public final ProductOptionRepositoryPort productOptionRepositoryPort;

    public ProductOptionUseCaseImpl(ProductOptionRepositoryPort productOptionRepositoryPort) {
        this.productOptionRepositoryPort = productOptionRepositoryPort;
    }

    @Override
    public ProductOption createProductOption(ProductOption productOption) {
        return productOptionRepositoryPort.save(productOption);
    }

    @Override
    public Optional<ProductOption> getProductOptionById(Long id) {
        return productOptionRepositoryPort.findById(id);
    }

    @Override
    public List<ProductOption> getAllProductOptions() {
        return productOptionRepositoryPort.findAll();
    }

    @Override
    public Optional<ProductOption> updateProductOption(Long id, ProductOption productOption) {
        return productOptionRepositoryPort.update(productOption);
    }

    @Override
    public boolean deleteProductOption(Long id) {
        return productOptionRepositoryPort.deleteById(id);
    }
}
