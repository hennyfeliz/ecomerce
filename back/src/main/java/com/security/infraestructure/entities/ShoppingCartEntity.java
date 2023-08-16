package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.Product;
import com.security.domain.model.ShoppingCart;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shopping_cart")
public class ShoppingCartEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userr")
    private UserEntity user;

//    @JsonIgnore
    @OneToMany(mappedBy = "shoppingCart")
    private List<ProductEntity> product;

    private int quantity;

    public static ShoppingCartEntity fromDomainModel(ShoppingCart shoppingCart){
        return new ShoppingCartEntity(shoppingCart.getId(), shoppingCart.getUser(), shoppingCart.getProduct(), shoppingCart.getQuantity());
    }

    public ShoppingCart toDomainModel(){
        return new ShoppingCart(id, user, product, quantity);
    }
}
