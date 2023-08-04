package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.Order;
import com.security.domain.model.OrderDetail;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class OrderDetailEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderr")
    private OrderEntity order;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product")
    private ProductEntity product;

    private String name;
    private float price;
    private String sku;
    private int quantity;

    public static OrderDetailEntity fromDomainModel(OrderDetail orderDetail){
        return new OrderDetailEntity(orderDetail.getId(), orderDetail.getOrder(), orderDetail.getProduct(), orderDetail.getName(), orderDetail.getPrice(),
                orderDetail.getSku(), orderDetail.getQuantity());
    }

    public OrderDetail toDomainModel(){
        return new OrderDetail(id, order, product, name, price, sku, quantity);
    }
}
