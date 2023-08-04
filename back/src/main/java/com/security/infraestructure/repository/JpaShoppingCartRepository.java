package com.security.infraestructure.repository;

import com.security.domain.model.ShoppingCart;
import com.security.infraestructure.entities.ShoppingCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaShoppingCartRepository extends JpaRepository<ShoppingCartEntity, Long> {
}
