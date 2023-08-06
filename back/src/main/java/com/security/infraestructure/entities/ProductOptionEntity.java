package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.Order;
import com.security.domain.model.ProductOption;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_options")
public class ProductOptionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "price_increment")
    private Float priceIncrement;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product")
    private ProductEntity product;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "optionn")
    private OptionEntity option;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "groupp")
    private OptionGroupEntity group;
    
    
    public static ProductOptionEntity fromDomainModel(ProductOption productOption){
        return new ProductOptionEntity(productOption.getId(), productOption.getPriceIncrement(), productOption.getProduct(), productOption.getOption(), productOption.getGroup());
    }

    public ProductOption toDomainModel(){
        return new ProductOption(id, priceIncrement, product, option, group);
    }
}
