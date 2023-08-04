package com.security.domain.ports.out;

import com.security.domain.model.Order;
import com.security.domain.model.OrderDetail;

import java.util.List;
import java.util.Optional;

public interface OrderDetailRepositoryPort {
    OrderDetail save(OrderDetail orderDetail);
    Optional<OrderDetail> findById(Long id);
    List<OrderDetail> findAll();
    Optional<OrderDetail> update(OrderDetail orderDetail);
    boolean deleteById(Long id);
}
