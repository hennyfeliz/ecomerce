package com.security.application.usecase;

import com.security.domain.model.Order;
import com.security.domain.ports.in.OrderUseCase;
import com.security.domain.ports.out.OrderRepositoryPort;

import java.util.List;
import java.util.Optional;

public class OrderUseCaseImpl implements OrderUseCase {
    public final OrderRepositoryPort orderRepositoryPort;

    public OrderUseCaseImpl(OrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepositoryPort.save(order);
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepositoryPort.findById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepositoryPort.findAll();
    }

    @Override
    public Optional<Order> updateOrder(Long id, Order order) {
        return orderRepositoryPort.update(order);
    }

    @Override
    public boolean deleteOrder(Long id) {
        return orderRepositoryPort.deleteById(id);
    }
}
