package com.security.domain.ports.out;

import com.security.domain.model.ShoppingCart;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartRepositoryPort {
    ShoppingCart save(ShoppingCart shoppingCart);
    Optional<ShoppingCart> findById(Long id);
    List<ShoppingCart> findAll();
    Optional<ShoppingCart> update(ShoppingCart shoppingCart);
    boolean deleteById(Long id);
}
