package com.security.infraestructure.repository.impl;

import com.security.domain.model.ShoppingCart;
import com.security.domain.ports.out.ShoppingCartRepositoryPort;
import com.security.infraestructure.repository.JpaShoppingCartRepository;
import com.security.infraestructure.entities.ShoppingCartEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaShoppingCartRepositoryAdapter implements ShoppingCartRepositoryPort {
    public final JpaShoppingCartRepository jpaShoppingCartRepository;

    public JpaShoppingCartRepositoryAdapter(JpaShoppingCartRepository jpaShoppingCartRepository) {
        this.jpaShoppingCartRepository = jpaShoppingCartRepository;
    }

    @Override
    public ShoppingCart save(ShoppingCart shoppingCart) {
        ShoppingCartEntity shoppingCartEntity = ShoppingCartEntity.fromDomainModel(shoppingCart);
        ShoppingCartEntity savedShoppingCart = jpaShoppingCartRepository.save(shoppingCartEntity);
        return savedShoppingCart.toDomainModel();
    }

    @Override
    public Optional<ShoppingCart> findById(Long id) {
        return jpaShoppingCartRepository.findById(id)
                .map(ShoppingCartEntity::toDomainModel);
    }

    @Override
    public List<ShoppingCart> findAll() {
        return jpaShoppingCartRepository.findAll().stream()
                .map(ShoppingCartEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ShoppingCart> update(ShoppingCart shoppingCart) {
        if(jpaShoppingCartRepository.existsById(shoppingCart.getId())){
            ShoppingCartEntity shoppingCartEntity = ShoppingCartEntity.fromDomainModel(shoppingCart);
            ShoppingCartEntity updatedShoppingCart = jpaShoppingCartRepository.save(shoppingCartEntity);
            return Optional.of(updatedShoppingCart.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaShoppingCartRepository.existsById(id)){
            jpaShoppingCartRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
