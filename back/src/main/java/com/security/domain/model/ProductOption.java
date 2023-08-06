package com.security.domain.model;

import com.security.infraestructure.entities.OptionEntity;
import com.security.infraestructure.entities.OptionGroupEntity;
import com.security.infraestructure.entities.ProductEntity;

import java.util.Objects;

public class ProductOption {
    private Long id;
    private Float priceIncrement;
    private ProductEntity product;
    private OptionEntity option;
    private OptionGroupEntity group;

    public ProductOption(Long id, Float priceIncrement, ProductEntity product, OptionEntity option, OptionGroupEntity group) {
        this.id = id;
        this.priceIncrement = priceIncrement;
        this.product = product;
        this.option = option;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPriceIncrement() {
        return priceIncrement;
    }

    public void setPriceIncrement(Float priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public OptionEntity getOption() {
        return option;
    }

    public void setOption(OptionEntity option) {
        this.option = option;
    }

    public OptionGroupEntity getGroup() {
        return group;
    }

    public void setGroup(OptionGroupEntity group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOption that = (ProductOption) o;
        return Objects.equals(id, that.id) && Objects.equals(priceIncrement, that.priceIncrement) && Objects.equals(product, that.product) && Objects.equals(option, that.option) && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, priceIncrement, product, option, group);
    }

    @Override
    public String toString() {
        return "ProductOption{" +
                "id=" + id +
                ", priceIncrement=" + priceIncrement +
                ", product=" + product +
                ", option=" + option +
                ", group=" + group +
                '}';
    }
}
