package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.Order;
import com.security.domain.model.Product;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "userr")
    private int user;
    private float amount;

    @Column(name = "ship_name")
    private String shipName;

    @Column(name = "ship_address")
    private String shipAddress;

    @Column(name = "ship_address2")
    private String shipAddress2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String fax;
    private float shipping;
    private float tax;
    private String email;
    private Date date;
    private byte shipped;
    @Column(name = "tracking_number")
    private String trackingNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    private List<OrderDetailEntity> orderDetailEntity;

    public static OrderEntity fromDomainModel(Order order){
        return new OrderEntity(order.getId(), order.getUser(), order.getAmount(), order.getShipName(), order.getShipAddress(), order.getShipAddress2(), order.getCity(),
        order.getState(), order.getZip(), order.getCountry(), order.getPhone(), order.getFax(), order.getShipping(), order.getTax(), order.getEmail(),
        order.getDate(), order.getShipped(), order.getTrackingNumber(), order.getOrderDetail());
    }

    public Order toDomainModel(){
        return new Order(id, user, amount, shipName, shipAddress, shipAddress2, city, state, zip, country, phone, fax, shipping, tax, email, date, shipped, trackingNumber, orderDetailEntity);
    }

}
