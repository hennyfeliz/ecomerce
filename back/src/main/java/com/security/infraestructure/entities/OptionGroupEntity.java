package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.OptionGroup;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "option_groups")
public class OptionGroupEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "optionGroupEntity")
    private List<OptionEntity> optionEntities;

    @JsonIgnore
    @OneToMany(mappedBy = "group")
    private List<ProductOptionEntity> productOptions;

    public static OptionGroupEntity fromDomainModel(OptionGroup optionGroup){
        return new OptionGroupEntity(optionGroup.getId(), optionGroup.getName(), optionGroup.getOptionEntities(), optionGroup.getProductOptions());
    }

    public OptionGroup toDomainModel(){
        return new OptionGroup(id, name, optionEntities, productOptions);
    }
}
