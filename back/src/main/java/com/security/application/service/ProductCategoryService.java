package com.security.application.service;

import com.security.domain.model.ProductCategory;
import com.security.domain.ports.in.ProductCategoryUseCase;

import java.util.List;
import java.util.Optional;

public class ProductCategoryService implements ProductCategoryUseCase {
    public final ProductCategoryUseCase productCategoryUseCase;

    public ProductCategoryService(ProductCategoryUseCase productCategoryUseCase) {
        this.productCategoryUseCase = productCategoryUseCase;
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        return productCategoryUseCase.createProductCategory(productCategory);
    }

    @Override
    public Optional<ProductCategory> getProductCategoryById(Long id) {
        return productCategoryUseCase.getProductCategoryById(id);
    }

    @Override
    public Optional<ProductCategory> getProductCategoryByName(String name) {
        return productCategoryUseCase.getProductCategoryByName(name);
    }


    @Override
    public List<ProductCategory> getAllProductCategorys() {
        return productCategoryUseCase.getAllProductCategorys();
    }

    @Override
    public Optional<ProductCategory> updateProductCategory(Long id, ProductCategory productCategory) {
        return productCategoryUseCase.updateProductCategory(id, productCategory);
    }

    @Override
    public boolean deleteProductCategory(Long id) {
        return productCategoryUseCase.deleteProductCategory(id);
    }
}
