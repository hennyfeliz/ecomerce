package com.security.infraestructure.repository;

import com.security.infraestructure.entities.OptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOptionRepository extends JpaRepository<OptionEntity, Long> {
}
