package com.security.infraestructure.repository;

import com.security.infraestructure.entities.ProductOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductOptionRepository extends JpaRepository<ProductOptionEntity, Long> {
}
