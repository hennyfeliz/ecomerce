package com.security.infraestructure.repository;

import com.security.infraestructure.entities.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
}
