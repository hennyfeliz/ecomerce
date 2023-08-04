package com.security.application.usecase;

import com.security.domain.model.ShoppingCart;
import com.security.domain.ports.in.ShoppingCartUseCase;
import com.security.domain.ports.out.ShoppingCartRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ShoppingCartUseCaseImpl implements ShoppingCartUseCase {
    public final ShoppingCartRepositoryPort shoppingCartRepositoryPort;

    public ShoppingCartUseCaseImpl(ShoppingCartRepositoryPort shoppingCartRepositoryPort) {
        this.shoppingCartRepositoryPort = shoppingCartRepositoryPort;
    }

    @Override
    public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepositoryPort.save(shoppingCart);
    }

    @Override
    public Optional<ShoppingCart> getShoppingCartById(Long id) {
        return shoppingCartRepositoryPort.findById(id);
    }

    @Override
    public List<ShoppingCart> getAllShoppingCarts() {
        return shoppingCartRepositoryPort.findAll();
    }

    @Override
    public Optional<ShoppingCart> updateShoppingCart(Long id, ShoppingCart shoppingCart) {
        return shoppingCartRepositoryPort.update(shoppingCart);
    }

    @Override
    public boolean deleteShoppingCart(Long id) {
        return shoppingCartRepositoryPort.deleteById(id);
    }
}
