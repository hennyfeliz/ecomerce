package com.security.domain.ports.in;

import com.security.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderUseCase {
    Order createOrder(Order order);
    Optional<Order> getOrderById(Long id);
    List<Order> getAllOrders();
    Optional<Order> updateOrder(Long id, Order order);
    boolean deleteOrder(Long id);
}
