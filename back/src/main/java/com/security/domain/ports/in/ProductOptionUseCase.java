package com.security.domain.ports.in;

import com.security.domain.model.ProductOption;

import java.util.List;
import java.util.Optional;

public interface ProductOptionUseCase {
    ProductOption createProductOption(ProductOption productOption);
    Optional<ProductOption> getProductOptionById(Long id);
    List<ProductOption> getAllProductOptions();
    Optional<ProductOption> updateProductOption(Long id, ProductOption productOption);
    boolean deleteProductOption(Long id);
}
