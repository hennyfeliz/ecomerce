package com.security.application.usecase;

import com.security.domain.model.ProductCategory;
import com.security.domain.ports.in.ProductCategoryUseCase;
import com.security.domain.ports.out.ProductCategoryRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ProductCategoryUseCaseImpl implements ProductCategoryUseCase {
    public final ProductCategoryRepositoryPort productCategoryRepositoryPort;

    public ProductCategoryUseCaseImpl(ProductCategoryRepositoryPort productCategoryRepositoryPort) {
        this.productCategoryRepositoryPort = productCategoryRepositoryPort;
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        return productCategoryRepositoryPort.save(productCategory);
    }

    @Override
    public Optional<ProductCategory> getProductCategoryById(Long id) {
        return productCategoryRepositoryPort.findById(id);
    }

    @Override
    public Optional<ProductCategory> getProductCategoryByName(String name) {
        return productCategoryRepositoryPort.findByName(name);
    }


    @Override
    public List<ProductCategory> getAllProductCategorys() {
        return productCategoryRepositoryPort.findAll();
    }

    @Override
    public Optional<ProductCategory> updateProductCategory(Long id, ProductCategory productCategory) {
        return productCategoryRepositoryPort.update(productCategory);
    }

    @Override
    public boolean deleteProductCategory(Long id) {
        return productCategoryRepositoryPort.deleteById(id);
    }
}
