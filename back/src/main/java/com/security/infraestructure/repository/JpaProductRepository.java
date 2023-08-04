package com.security.infraestructure.repository;

import com.security.domain.model.Product;
import com.security.infraestructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<Product> findByName(String name);
}
