package com.security.application.usecase;

import com.security.domain.model.OrderDetail;
import com.security.domain.ports.in.OrderDetailUseCase;
import com.security.domain.ports.out.OrderDetailRepositoryPort;

import java.util.List;
import java.util.Optional;

public class OrderDetailUseCaseImpl implements OrderDetailUseCase {
    public final OrderDetailRepositoryPort orderDetailRepositoryPort;

    public OrderDetailUseCaseImpl(OrderDetailRepositoryPort orderDetailRepositoryPort) {
        this.orderDetailRepositoryPort = orderDetailRepositoryPort;
    }

    @Override
    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepositoryPort.save(orderDetail);
    }

    @Override
    public Optional<OrderDetail> getOrderDetailById(Long id) {
        return orderDetailRepositoryPort.findById(id);
    }

    @Override
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepositoryPort.findAll();
    }

    @Override
    public Optional<OrderDetail> updateOrderDetail(Long id, OrderDetail orderDetail) {
        return orderDetailRepositoryPort.update(orderDetail);
    }

    @Override
    public boolean deleteOrderDetail(Long id) {
        return orderDetailRepositoryPort.deleteById(id);
    }
}
