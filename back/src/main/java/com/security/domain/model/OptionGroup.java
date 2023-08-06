package com.security.domain.model;

import com.security.infraestructure.entities.OptionEntity;
import com.security.infraestructure.entities.ProductOptionEntity;

import java.util.List;
import java.util.Objects;

public class OptionGroup {
    private Long id;
    private String name;
    private List<OptionEntity> optionEntities;
    private List<ProductOptionEntity> productOptions;

    public OptionGroup(Long id, String name, List<OptionEntity> optionEntities, List<ProductOptionEntity> productOptions) {
        this.id = id;
        this.name = name;
        this.optionEntities = optionEntities;
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

    public List<OptionEntity> getOptionEntities() {
        return optionEntities;
    }

    public void setOptionEntities(List<OptionEntity> optionEntities) {
        this.optionEntities = optionEntities;
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
        OptionGroup that = (OptionGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "OptionGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", optionEntities=" + optionEntities +
                ", productOptions=" + productOptions +
                '}';
    }
}
