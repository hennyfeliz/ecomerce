package com.security.domain.ports.out;

import com.security.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepositoryPort {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findAll();
    Optional<Order> update(Order order);
    boolean deleteById(Long id);
}
