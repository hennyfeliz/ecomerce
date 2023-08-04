package com.security.application.service;

import com.security.domain.model.ShoppingCart;
import com.security.domain.ports.in.ShoppingCartUseCase;

import java.util.List;
import java.util.Optional;

public class ShoppingCartService implements ShoppingCartUseCase {
    public final ShoppingCartUseCase shoppingCartUseCase;

    public ShoppingCartService(ShoppingCartUseCase shoppingCartUseCase) {
        this.shoppingCartUseCase = shoppingCartUseCase;
    }

    @Override
    public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartUseCase.createShoppingCart(shoppingCart);
    }

    @Override
    public Optional<ShoppingCart> getShoppingCartById(Long id) {
        return shoppingCartUseCase.getShoppingCartById(id);
    }


    @Override
    public List<ShoppingCart> getAllShoppingCarts() {
        return shoppingCartUseCase.getAllShoppingCarts();
    }

    @Override
    public Optional<ShoppingCart> updateShoppingCart(Long id, ShoppingCart shoppingCart) {
        return shoppingCartUseCase.updateShoppingCart(id, shoppingCart);
    }

    @Override
    public boolean deleteShoppingCart(Long id) {
        return shoppingCartUseCase.deleteShoppingCart(id);
    }
}
