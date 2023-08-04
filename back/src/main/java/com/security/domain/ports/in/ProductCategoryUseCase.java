package com.security.domain.ports.in;

import com.security.domain.model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryUseCase {
    ProductCategory createProductCategory(ProductCategory productCategory);
    Optional<ProductCategory> getProductCategoryById(Long id);
    Optional<ProductCategory> getProductCategoryByName(String name);
    List<ProductCategory> getAllProductCategorys();
    Optional<ProductCategory> updateProductCategory(Long id, ProductCategory productCategory);
    boolean deleteProductCategory(Long id);
}
