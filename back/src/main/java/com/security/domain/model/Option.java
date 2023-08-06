package com.security.domain.model;

import com.security.infraestructure.entities.OptionGroupEntity;
import com.security.infraestructure.entities.ProductOptionEntity;

import java.util.List;
import java.util.Objects;

public class Option {
    private Long id;
    private String name;
    private OptionGroupEntity optionGroupEntity;
    private List<ProductOptionEntity> productOptions;

    public Option(Long id, String name, OptionGroupEntity optionGroupEntity, List<ProductOptionEntity> productOptions) {
        this.id = id;
        this.name = name;
        this.optionGroupEntity = optionGroupEntity;
        this.productOptions = productOptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OptionGroupEntity getOptionGroupEntity() {
        return optionGroupEntity;
    }

    public void setOptionGroupEntity(OptionGroupEntity optionGroupEntity) {
        this.optionGroupEntity = optionGroupEntity;
    }

    public List<ProductOptionEntity> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(List<ProductOptionEntity> productOptions) {
        this.productOptions = productOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return Objects.equals(id, option.id) && Objects.equals(name, option.name) && Objects.equals(optionGroupEntity, option.optionGroupEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, optionGroupEntity);
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", optionGroupEntity=" + optionGroupEntity +
                ", productOptions=" + productOptions +
                '}';
    }
}
