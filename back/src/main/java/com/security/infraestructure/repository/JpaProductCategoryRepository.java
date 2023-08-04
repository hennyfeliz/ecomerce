package com.security.infraestructure.repository;

import com.security.domain.model.ProductCategory;
import com.security.infraestructure.entities.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {
    Optional<ProductCategory> findByName(String name);
}
