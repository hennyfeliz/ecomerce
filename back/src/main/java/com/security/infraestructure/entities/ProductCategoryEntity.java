package com.security.infraestructure.entities;


import com.security.domain.model.ProductCategory;
import com.security.domain.model.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_categories")
public class ProductCategoryEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    private String name;

    public static ProductCategoryEntity fromDomainModel(ProductCategory productCategory){
        return new ProductCategoryEntity(productCategory.getId(), productCategory.getName());
    }

    public ProductCategory toDomainModel(){
        return new ProductCategory(id, name);
    }
}
