package com.security.domain.model;

import com.security.infraestructure.entities.ProductEntity;
import com.security.infraestructure.entities.ProductEntity;
import com.security.infraestructure.entities.UserEntity;

import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private Long id;
    private UserEntity user;
    private List<ProductEntity> product;
    private int quantity;

    public ShoppingCart(Long id, UserEntity user, List<ProductEntity> product, int quantity) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<ProductEntity> getProduct() {
        return product;
    }

    public void setProduct(List<ProductEntity> product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return quantity == that.quantity && Objects.equals(id, that.id) && Objects.equals(user, that.user) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, product, quantity);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
