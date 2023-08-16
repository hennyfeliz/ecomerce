package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.Product;
import com.security.domain.model.ProductCategory;
import com.security.domain.model.ShoppingCart;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class ProductEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    private String sku;
    private String name;
    private float price;
    private float weight;

    @Column(name = "cart_desc")
    private String cartDesc;

    @Column(name = "short_desc")
    private String shortDesc;

    @Column(name = "long_desc")
    private String longDesc;
    private String thumb;
    private String image;
    private Integer category;

    @Column(name = "update_date")
    private Date updateDate;
    private Float stock;
    private byte live;
    private byte unlimited;
    private String location;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    @ToString.Exclude
    private List<OrderDetailEntity> orderDetail;



//    @JsonIgnore
//    @ManyToOne(targetEntity = ShoppingCartEntity.class, cascade = CascadeType.ALL)
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "shopping_cart")
    private ShoppingCartEntity shoppingCart;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<ProductOptionEntity> productOptions;

    public static ProductEntity fromDomainModel(Product product){
        return new ProductEntity(product.getId(), product.getSku(), product.getName(), product.getPrice(), product.getWeight(), product.getCartDesc(), product.getShortDesc(), product.getLongDesc(),
                product.getThumb(), product.getImage(), product.getCategory(), product.getUpdateDate(), product.getStock(), product.getLive(), product.getUnlimited(), product.getLocation(),
                product.getOrderDetail(), product.getShoppingCart(), product.getProductOptions());
    }

    public Product toDomainModel(){
        return new Product(id, sku, name, price, weight, cartDesc, shortDesc, longDesc, thumb, image, category, updateDate, stock, live, unlimited, location, orderDetail, shoppingCart, productOptions);
    }
}
