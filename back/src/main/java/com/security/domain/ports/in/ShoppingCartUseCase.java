package com.security.domain.ports.in;

import com.security.domain.model.ShoppingCart;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartUseCase {
    ShoppingCart createShoppingCart(ShoppingCart shoppingCart);
    Optional<ShoppingCart> getShoppingCartById(Long id);
    List<ShoppingCart> getAllShoppingCarts();
    Optional<ShoppingCart> updateShoppingCart(Long id, ShoppingCart shoppingCart);
    boolean deleteShoppingCart(Long id);
}
