package com.security.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.domain.model.Option;
import com.security.domain.model.OptionGroup;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "options")
public class OptionEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "option_group")
    private OptionGroupEntity optionGroupEntity;

    @JsonIgnore
    @OneToMany(mappedBy = "option")
    private List<ProductOptionEntity> productOptions;

    public static OptionEntity fromDomainModel(Option option){
        return new OptionEntity(option.getId(), option.getName(), option.getOptionGroupEntity(), option.getProductOptions());
    }

    public Option toDomainModel(){
        return new Option(id, name, optionGroupEntity, productOptions);
    }

}
