package com.security.application.service;

import com.security.domain.model.ProductOption;
import com.security.domain.ports.in.ProductOptionUseCase;

import java.util.List;
import java.util.Optional;

public class ProductOptionService implements ProductOptionUseCase {
    public final ProductOptionUseCase productOptionUseCase;

    public ProductOptionService(ProductOptionUseCase productOptionUseCase) {
        this.productOptionUseCase = productOptionUseCase;
    }

    @Override
    public ProductOption createProductOption(ProductOption productOption) {
        return productOptionUseCase.createProductOption(productOption);
    }

    @Override
    public Optional<ProductOption> getProductOptionById(Long id) {
        return productOptionUseCase.getProductOptionById(id);
    }


    @Override
    public List<ProductOption> getAllProductOptions() {
        return productOptionUseCase.getAllProductOptions();
    }

    @Override
    public Optional<ProductOption> updateProductOption(Long id, ProductOption productOption) {
        return productOptionUseCase.updateProductOption(id, productOption);
    }

    @Override
    public boolean deleteProductOption(Long id) {
        return productOptionUseCase.deleteProductOption(id);
    }
}
