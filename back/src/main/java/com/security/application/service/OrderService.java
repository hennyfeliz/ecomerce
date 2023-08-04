package com.security.application.service;

import com.security.domain.model.Order;
import com.security.domain.ports.in.OrderUseCase;

import java.util.List;
import java.util.Optional;

public class OrderService implements OrderUseCase {
    public final OrderUseCase orderUseCase;

    public OrderService(OrderUseCase orderUseCase) {
        this.orderUseCase = orderUseCase;
    }

    @Override
    public Order createOrder(Order order) {
        return orderUseCase.createOrder(order);
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderUseCase.getOrderById(id);
    }


    @Override
    public List<Order> getAllOrders() {
        return orderUseCase.getAllOrders();
    }

    @Override
    public Optional<Order> updateOrder(Long id, Order order) {
        return orderUseCase.updateOrder(id, order);
    }

    @Override
    public boolean deleteOrder(Long id) {
        return orderUseCase.deleteOrder(id);
    }
}
