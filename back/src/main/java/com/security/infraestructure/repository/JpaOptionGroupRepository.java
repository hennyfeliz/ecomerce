package com.security.infraestructure.repository;

import com.security.domain.model.OptionGroup;
import com.security.infraestructure.entities.OptionGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOptionGroupRepository extends JpaRepository<OptionGroupEntity, Long> {
}
