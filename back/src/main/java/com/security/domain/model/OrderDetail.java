package com.security.domain.model;


import com.security.infraestructure.entities.OrderEntity;
import com.security.infraestructure.entities.ProductEntity;

import java.util.Objects;

public class OrderDetail {
    private Long id;
    private OrderEntity order;
    private ProductEntity product;
    private String name;
    private float price;
    private String sku;
    private int quantity;

    public OrderDetail(Long id, OrderEntity order, ProductEntity product, String name, float price, String sku, int quantity) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.name = name;
        this.price = price;
        this.sku = sku;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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
        OrderDetail that = (OrderDetail) o;
        return id == that.id && Float.compare(that.price, price) == 0 && quantity == that.quantity && Objects.equals(order, that.order) && Objects.equals(product, that.product) && Objects.equals(name, that.name) && Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order, product, name, price, sku, quantity);
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

